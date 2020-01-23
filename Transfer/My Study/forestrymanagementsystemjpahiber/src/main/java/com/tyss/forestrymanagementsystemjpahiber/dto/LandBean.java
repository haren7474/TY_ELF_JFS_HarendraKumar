package com.tyss.forestrymanagementsystemjpahiber.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "land")
@SequenceGenerator(name = "land_seq", initialValue = 6001, allocationSize = 6499)
public class LandBean {
	@Id
	@Column(name = "land_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "land_seq")
	private int landId;

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

	@Column(name = "due_Date")
	private Date dueDate;

	@Column(name = "is_Land_Disputed")
	private boolean isLandDisputed;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "userId")
	private UserBean userBean;

	@Override
	public String toString() {
		return landId + "\t" + userBean.getFullName() + "\t" + landAreaInSqFeet + "\t\t" + landLongitude + "\t\t"
				+ landLongitude + "\t" + landCost + "\t" + landTax + "\t" + isLandDisputed  + "\t" + dueDate;
	}
}
