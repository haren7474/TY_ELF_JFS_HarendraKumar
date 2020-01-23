package com.tyss.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Product 
{
	@Id
	@Column
	private int pId;
	@Column
	private String pName;
	@Column
	private double price;
}
