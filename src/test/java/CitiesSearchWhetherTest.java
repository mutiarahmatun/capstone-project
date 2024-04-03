import io.qameta.allure.Feature;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@Feature("Search City")
public class CitiesSearchWhetherTest extends BaseTestWhether2 {

    String apiKey = "V17H3Of6Kd7gjWEBvYuMErqVVzXoWBgZ";

    @Test(description = "Search City by Text")
    public void SearchCityByText(){
        given()
                .queryParam("apikey",apiKey)
                .log().ifValidationFails()
                .when()
                .get("Medan")
                .then()
                .log().ifValidationFails()
                .statusCode(200);
    }
}
