import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class DemoTest {


    @Test
    public void testGetEndpoint() {
        RestAssured.baseURI = "https://serverest.dev";

        given().
                when().
                get("/usuarios").
                then().log().all().
                statusCode(200);

    }


}
