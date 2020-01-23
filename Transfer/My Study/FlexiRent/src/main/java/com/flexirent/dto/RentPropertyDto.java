package com.flexirent.dto;

import java.time.LocalDate;

public class RentPropertyDto 
{
	private String propertyId;
	private Integer bookingId;
	private String customerId;
	private LocalDate rentDate;
	private Integer numberOfDays;
	private LocalDate expectedReturnDate;
	private LocalDate actualReturnDate;
	private String propertyStatus;
	
	public RentPropertyDto(String propertyId, String customerId, LocalDate rentDate,
			Integer numberOfDays, String propertyStatus) 
	{
		this.propertyId = propertyId;
		this.customerId = customerId;
		this.rentDate = rentDate;
		this.numberOfDays = numberOfDays;
		this.propertyStatus= propertyStatus;
	}

	public RentPropertyDto(Integer bookingId, LocalDate actualReturnDate) 
	{
		this.bookingId= bookingId;
		this.actualReturnDate=actualReturnDate;
	}

	public RentPropertyDto(String propertyId, String propertyNewStatus) 
	{
		this.propertyId=propertyId;
		this.propertyStatus= propertyNewStatus;
	}


	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public LocalDate getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
	}

	public Integer getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public LocalDate getExpectedReturnDate() {
		return expectedReturnDate;
	}

	public void setExpectedReturnDate(LocalDate expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}

	public LocalDate getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(LocalDate actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}
	
	
}
