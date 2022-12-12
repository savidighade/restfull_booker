package com.restful.booker.testcases;

import com.restful.booker.json.AuthRequestPayload;
import com.restful.booker.json.AuthResponsePayload;
import com.restful.booker.testRestfulBooker.AuthApi;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BaseTest 
{
	 protected String token;
	  protected final Faker faker = new Faker();

	  @BeforeAll
	  void testHealthCheckReturns201() {
	    Response response = PingApi.healthCheck();

	    assertThat(response.statusCode(), equalTo(SC_CREATED));
	  }

	  @BeforeEach
	  void testCreateTokenReturns200() {
	    AuthRequestPayload authRequestPayload =
	        AuthRequestPayload.builder().username("admin").password("password123").build();

	    Response response = AuthApi.createToken(authRequestPayload);
	    token = response.as(AuthResponsePayload.class).getToken();

	    assertThat(response.statusCode(), equalTo(SC_OK));
	  }

	  @Test
	  void testCreateTokenReturnsNonEmptyToken() {
	    assertThat(token, is(not(emptyString())));
	  }
	}

}
