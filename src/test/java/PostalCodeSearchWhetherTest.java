import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Feature("Search Postal Code")
public class PostalCodeSearchWhetherTest extends BaseTestWhether3 {

    String apiKey = "V17H3Of6Kd7gjWEBvYuMErqVVzXoWBgZ";

    @Test(description = "Search Postal Code by Text")
    public void SearchPostalCodeByText(){
        given()
                .queryParam("apikey",apiKey)
                .queryParam("20852")
                .log().ifValidationFails()
                .when()
                .get()
                .then()
                .log().ifValidationFails()
                .statusCode(200);
    }
}
