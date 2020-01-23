package com.flexirent.dto;

import java.time.LocalDate;

public class BillingDto 
{
	private int bookingId;
	private LocalDate rentDate;
	private LocalDate expectedReturnDate;
	private LocalDate actualReturnDate;
	private double baseAmount;
	private double penaltyAmount;
	private double totalAmount;
	
	public BillingDto(int bookingId, LocalDate rentDate, LocalDate expectedReturnDate, LocalDate actualReturnDate,
			double baseAmount, double penaltyAmount, double totalAmount) {
		this.bookingId = bookingId;
		this.rentDate = rentDate;
		this.expectedReturnDate = expectedReturnDate;
		this.actualReturnDate = actualReturnDate;
		this.baseAmount = baseAmount;
		this.penaltyAmount = penaltyAmount;
		this.totalAmount = totalAmount;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDate getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDate rentDate) {
		this.rentDate = rentDate;
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

	public double getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
