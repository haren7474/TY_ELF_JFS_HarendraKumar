package com.flexirent.dto;

import java.time.LocalDate;

public class PropertyDto 
{
	private Integer propertyType;
	private String streetNumber;
	private String subUrb;
	private Integer numerOfBedrooms;
	private LocalDate lastMaintenanceDate;
	private LocalDate maintenanceCompletionDate;
	private String propertyId;
	private String propertyStatus;
	
	public PropertyDto(Integer propertyType, String streetNumber, String subUrb, Integer numerOfBedrooms,
			LocalDate lastMaintenanceDate, String propertyId) 
	{
		this.propertyType = propertyType;
		this.streetNumber = streetNumber;
		this.subUrb = subUrb;
		this.numerOfBedrooms = numerOfBedrooms;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.propertyId = propertyId;
	}

	public PropertyDto(String propertyStatus) 
	{
		this.propertyStatus= propertyStatus;
	}

	public Integer getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(Integer propertyType) {
		this.propertyType = propertyType;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getSubUrb() {
		return subUrb;
	}

	public void setSubUrb(String subUrb) {
		this.subUrb = subUrb;
	}

	public Integer getNumerOfBedrooms() {
		return numerOfBedrooms;
	}

	public void setNumerOfBedrooms(Integer numerOfBedrooms) {
		this.numerOfBedrooms = numerOfBedrooms;
	}

	public LocalDate getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}

	public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}

	public LocalDate getMaintenanceCompletionDate() {
		return maintenanceCompletionDate;
	}

	public void setMaintenanceCompletionDate(LocalDate maintenanceCompletionDate) {
		this.maintenanceCompletionDate = maintenanceCompletionDate;
	}

	public String getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyStatus() {
		return propertyStatus;
	}

	public void setPropertyStatus(String propertyStatus) {
		this.propertyStatus = propertyStatus;
	}
	
	
}
