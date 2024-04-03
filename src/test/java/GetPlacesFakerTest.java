import io.qameta.allure.Feature;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.CoreMatchers.equalTo;

@Feature("Verify API Get Places")
public class GetPlacesFakerTest extends BaseTestFaker4 {

    @Test(description = "Get list places")
    public void GetListPlaces(){
        given().log().all().contentType(JSON).when().log().all().get("_quantity=10")
                .then().log().ifValidationFails().statusCode(200).body("total", equalTo(10));
    }
}
