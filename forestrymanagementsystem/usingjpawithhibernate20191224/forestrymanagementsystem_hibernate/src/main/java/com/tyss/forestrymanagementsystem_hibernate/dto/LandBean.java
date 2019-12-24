package com.tyss.forestrymanagementsystem_hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "land")
public class LandBean {
	@Id
	@Column(name = "land_Id")
	private int landId;

	@Column(name = "owner_Id")
	private int landOwnerId;

	@Column(name = "land_Area_In_Sq_Feet")
	private int landAreaInSqFeet;

	@Column(name = "land_Latitude")
	private String landLatitude;

	@Column(name = "land_Longitude")
	private String landLongitude;

	@Column(name = "land_Cost")
	private double landCost;

	@Column(name = "land_Tax")
	private double landTax;

	@Column(name = "is_Land_Disputed")
	private boolean isLandDisputed;

	@Override
	public String toString() {
		return landId + "\t" + landOwnerId + "\t" + landAreaInSqFeet + "\t\t" + landLongitude + "\t\t" + landLongitude
				+ "\t" + landCost + "\t" + landTax + "\t" + isLandDisputed;
	}
}
