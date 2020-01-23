package com.tyss.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello {//implements InitializingBean, DisposableBean {
	private String message;
	private double count;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public Hello() {
		System.out.println("Hello Object Created by constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("init method");
	}

	/*
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	*/
	
	@PreDestroy
	//@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");

	}
	
}
