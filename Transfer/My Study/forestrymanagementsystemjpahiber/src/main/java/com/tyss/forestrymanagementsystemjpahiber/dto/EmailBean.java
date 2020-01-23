package com.tyss.forestrymanagementsystemjpahiber.dto;

import java.time.LocalDateTime;

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

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "email_land")
@SequenceGenerator(name = "email_seq", initialValue = 8001, allocationSize = 8499)
public class EmailBean {
	@Id
	@Column(name = "land_email_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "email_seq")
	private int landEmailId;

	@Column(name = "email_Text")
	private String emailText;

	@Column(name = "email_Sender")
	private String emailSender;

	@Column(name = "email_Timestamp")
	@CreationTimestamp
	private LocalDateTime emailTimestamp;

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "landId")
	private LandBean landBean;

	@Override
	public String toString() {
		return landEmailId + "\t" + emailSender + "\t" + emailTimestamp + "\t" + landBean.getUserBean().getFullName()
				+ "\t" + emailText;
	}
}
