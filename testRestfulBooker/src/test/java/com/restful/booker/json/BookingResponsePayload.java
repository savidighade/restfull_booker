package com.restful.booker.json;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class BookingResponsePayload 
{
	 @JsonProperty("bookingid")
	  private int bookingId;

	  @JsonProperty("booking")
	  private BookingRequestPayload bookingRequestPayload;

}
