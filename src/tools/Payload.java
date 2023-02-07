package tools;

import io.restassured.path.json.JsonPath;

public class Payload {

	public static String addBook() {
		String payload =
		"{ \r\n"
		+ "\r\n"
		+ " \r\n"
		+ "\r\n"
		+ "\"name\":\"Aprender Cenas\", \r\n"
		+ "\r\n"
		+ "\"isbn\":\"nunotest\", \r\n"
		+ "\r\n"
		+ "\"aisle\":\"3\", \r\n"
		+ "\r\n"
		+ "\"author\":\"Nuno Antunes\" \r\n"
		+ "\r\n"
		+ "} "
		;
		return payload;
	}
	
	public static String deleteBook(String id) {
		String str =
				"{\r\n"
				+ "    \"ID\": \""+id+"\"\r\n"
				+ "}"
		;
		return str;
	}
}
