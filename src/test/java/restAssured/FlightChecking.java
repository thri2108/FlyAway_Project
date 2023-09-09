package restAssured;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class FlightChecking {

	private static final Logger logger = LoggerFactory.getLogger(FlightChecking.class);
	@Test
	public void checkflights() {
		baseURI = "http://localhost:9090/FlyAway/";
		given()
		.get("home?source=1&destination=11")
		.then()
		.statusCode(200);
		
		logger.info("Test case 'checkflights' executed");
	}
}
