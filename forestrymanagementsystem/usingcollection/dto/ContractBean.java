package com.tyss.fms.dto;

import java.sql.Date;
import java.time.DayOfWeek;

import lombok.Data;

@Data
public class ContractBean 
{
	private String contractNo;
	private String customerId;
	private String productId;
	private String haulierId;
	private String deliveryDate;
	private String day;
	private int quantity;
}
