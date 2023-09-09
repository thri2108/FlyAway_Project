package restAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class BookingConfirmation {

	private static final Logger logger = LoggerFactory.getLogger(FlightChecking.class);
	@Test
	public void confirmbooking() {
		baseURI = "http://localhost:9090/FlyAway/";
		given()
		.get("completepurchase")
		.then()
		.statusCode(200);
		
		logger.info("Test case 'confirmbooking' executed");
}
}
