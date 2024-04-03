import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Feature("Region List")
public class RegionWhetherTest extends BaseTestWhether1 {

    String apikey = "SGo3SuVp6hUM75N1uJRnf3U5STAIte3l";

    @Test(description = "Showing Region List")
    public void RegionTest() {
        given()
                .queryParam("apikey", apikey)
                .log().ifValidationFails()
                .when()
                .get("regions")
                .then()
                .log().ifValidationFails()
                .statusCode(200);
    }
}
