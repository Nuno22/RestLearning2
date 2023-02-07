package api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import tools.Methods;
import tools.Payload;

public class AddBook {
	
	public static JsonPath addBook() {
		RestAssured.baseURI = "http://216.10.245.166";
		String addBookResponse = given().header("Content-Type", "text/plain")
		.body(Payload.addBook())
		.when().post("Library/Addbook.php")
		.then().statusCode(200).log().all().extract().response().asPrettyString()
		;
		return Methods.convertToJson(addBookResponse);
	}

}
