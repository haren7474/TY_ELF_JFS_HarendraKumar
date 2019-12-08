package com.tyss.fms.dto;

import lombok.Data;

@Data
public class LandBean {
	private int landId;
	private int landOwnerId;
	private int landAreaInSqFeet;
	private String landLatitude;
	private String landLongitude;
	private double landCost;
	private double landTax;
	private boolean isLandDisputed;

	@Override
	public String toString() {
		return landId + "\t" + landOwnerId + "\t" + landAreaInSqFeet + "\t\t" + landLongitude + "\t\t" + landLongitude
				+ "\t" + landCost + "\t" + landTax + "\t" + isLandDisputed;
	}
}
