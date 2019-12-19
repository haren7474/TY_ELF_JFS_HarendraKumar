package com.tyss.myfirstwebapp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
public class UserBean {
	@Id
	@Column
	private int userid;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	private String password;
}
