
import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
	
	
public class Lab001 {

	@Test
public	void test() {
		
	RestAssured.baseURI = "https://jpetstore.aspectran.com";

    given()

    .when()
        .get("/catalog/categories")

    .then()
        .statusCode(200)
        .log().all();

}
	
}
	
	