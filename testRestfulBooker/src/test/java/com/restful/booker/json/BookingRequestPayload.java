package com.restful.booker.json;

public class BookingRequestPayload 
{

	@JsonProperty("firstname")
	  private String firstName;

	  @JsonProperty("lastname")
	  private String lastName;

	  @JsonProperty("totalprice")
	  private int totalPrice;

	  @JsonProperty("depositpaid")
	  private boolean depositPaid;

	  @JsonProperty("bookingdates")
	  private BookingDates bookingDates;

	  @JsonProperty("additionalneeds")
	  private String additionalNeeds;
}
