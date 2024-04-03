import io.qameta.allure.Feature;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@Feature("Test Meal Plan")
public class ShoppingList extends BaseTestSpoonacular {

    String apiKey = "e50b64651133412f89bc24ff1faad1a9";
    String hash = "afac8da18a6acc44bd3146984653c415c30abcab";
    String username = "vera0";

    @Test(description = "Add to Shopping List")
    public void AddtoShoppingListTest(){
        String requestBody = "{\n" +
                "\t\"item\": \"1 package baking powder\",\n" +
                "\t\"aisle\": \"Baking\",\n" +
                "\t\"parse\": true\n" +
                "}";
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("apiKey",apiKey)
                .queryParam("hash",hash)
                .body(requestBody)
                .log().ifValidationFails()
                .when()
                .post("/vera0/shopping-list/items")
                .then()
                .log().ifValidationFails()
                .statusCode(200)
                .body("aisle",equalTo("Baking"));
    }
    @Test(description = "Get Shopping List")
    public void GetShoppingListTest(){
        given ()
                .queryParam("apiKey",apiKey)
                .queryParam("hash",hash)
                .log().ifValidationFails()
                .when()
                .get("/vera0/shopping-list")
                .then()
                .log().ifValidationFails()
                .statusCode(200);
    }
    @Test(description = "Delete shopping list item")
    public void DeleteShoppingListItemTest(){
        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .queryParam("apiKey",apiKey)
                .queryParam("hash",hash)
                .when()
                .delete("/{username}/shopping-list/items/4499908",username)
                .then()
                .log().ifValidationFails()
                .statusCode(200)
                .body("status",equalTo("success"));
    }

}
