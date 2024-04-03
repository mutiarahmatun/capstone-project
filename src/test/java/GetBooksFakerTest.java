import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.CoreMatchers.equalTo;

@Feature("Verify API Get Books")
public class GetBooksFakerTest extends BaseTestFaker2 {

    @Test(description = "Get list books")
    public void GetListBooks(){
        given().log().all().contentType(JSON).when().log().all().get("_quantity=10&_locale=en_US")
                .then().log().ifValidationFails().statusCode(200).body("total", equalTo(10));
    }
}
