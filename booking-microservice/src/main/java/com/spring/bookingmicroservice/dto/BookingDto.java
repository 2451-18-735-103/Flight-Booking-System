package com.spring.bookingmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {

    private String bookingId;
    private Integer flightId;
    private String userName;
    private Boolean bookingStatus;
    private Boolean checkInStatus;
    private String checkInId;
    private Integer noOfPersons;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Boolean getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public Boolean getCheckInStatus() {
		return checkInStatus;
	}
	public void setCheckInStatus(Boolean checkInStatus) {
		this.checkInStatus = checkInStatus;
	}
	public String getCheckInId() {
		return checkInId;
	}
	public void setCheckInId(String checkInId) {
		this.checkInId = checkInId;
	}
	public Integer getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(Integer noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public BookingDto(String bookingId, Integer flightId, String userName, Boolean bookingStatus, Boolean checkInStatus,
			String checkInId, Integer noOfPersons) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.userName = userName;
		this.bookingStatus = bookingStatus;
		this.checkInStatus = checkInStatus;
		this.checkInId = checkInId;
		this.noOfPersons = noOfPersons;
	}
	public BookingDto() {
	
		// TODO Auto-generated constructor stub
	}
	
    
}
