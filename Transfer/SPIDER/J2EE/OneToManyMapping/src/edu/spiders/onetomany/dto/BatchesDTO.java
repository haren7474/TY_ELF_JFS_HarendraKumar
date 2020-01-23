package edu.spiders.onetomany.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batches_table")
public class BatchesDTO 
{
	@Id
	@Column(name="batch_name")
	private String batchCode;
	
	@Column(name="subject")
	private String subject;

	public BatchesDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+ "Object Created");
	}

	public BatchesDTO(String batchCode, String subject) 
	{
		this.batchCode = batchCode;
		this.subject = subject;
	}
	
	
}

