package com.restful.booker.testRestfulBooker;
import static io.restassured.RestAssured.given;

import com.restful.booker.json.AuthRequestPayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthApi
{
	 private AuthApi() {}

	  public static Response createToken(AuthRequestPayload authRequestPayload) {
	    return given()
	        .contentType(ContentType.JSON)
	        .body(authRequestPayload)
	        .when()
	        .post(BASE_URL + AUTH_ENDPOINT);
	  }

}
