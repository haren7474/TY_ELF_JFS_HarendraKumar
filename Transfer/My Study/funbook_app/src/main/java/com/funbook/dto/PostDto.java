package com.funbook.dto;

import java.sql.Timestamp;

public class PostDto {
	private String text;
	private Timestamp timestamp;
	private Integer userId;
	private Integer commetByUserId;
	public Integer getCommetByUserId() {
		return commetByUserId;
	}
	public void setCommetByUserId(Integer commetByUserId) {
		this.commetByUserId = commetByUserId;
	}
	private Integer userPostId;
	public Integer getUserPostId() {
		return userPostId;
	}
	public void setUserPostId(Integer userPostId) {
		this.userPostId = userPostId;
	}
	private String userName;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
