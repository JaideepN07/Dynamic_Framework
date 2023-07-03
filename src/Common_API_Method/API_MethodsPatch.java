package Common_API_Method;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class API_MethodsPatch {
	
	public static int ResponseStatusCode(String BaseURI, String Resource, String RequestBody) {
		
		RestAssured.baseURI = BaseURI;
		int statusCode = given().header("Content-Type","application/json").body(RequestBody).
				when().patch(Resource).then().extract().statusCode();
		return statusCode;
	}
	public static String ResponseBody(String BaseURI,String Resource,String RequestBody) {
		
		RestAssured.baseURI = BaseURI;
		
		String ResponseBody = given().header("Content-Type","application/json").body(RequestBody).
				when().patch(Resource).then().extract().asPrettyString();
		return ResponseBody;
	}

}