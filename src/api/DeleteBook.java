package api;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class DeleteBook {
	
	public static void deleteBook(String str) {

	RestAssured.baseURI = "http://216.10.245.166";
	given().header("Content-Type", "text/plain")
	.body(str)
	.when().delete("/Library/DeleteBook.php")
	.then().statusCode(200).log().all().extract().response().asPrettyString()
	;
	}
}
