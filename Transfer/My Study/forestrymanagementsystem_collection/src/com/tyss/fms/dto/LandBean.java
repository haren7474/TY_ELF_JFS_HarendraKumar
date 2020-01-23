package com.tyss.fms.dto;

import lombok.Data;

@Data
public class LandBean 
{
	private String landId;
	private String ownerId;
	private int landAreaInSqFeet;
	private String landLatitude;
	private String landLongitude;
	private double landCost;
	private double landTax;
	private boolean isLandDisputed;
}
