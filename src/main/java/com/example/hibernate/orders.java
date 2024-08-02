package com.example.hibernate;

import jakarta.persistence.Entity;

@Entity
public class orders {

	private int id;
	private Long orderid;
	private String ordername;
	private String customername;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public orders(int id, Long orderid, String ordername, String customername) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.ordername = ordername;
		this.customername = customername;
	}
	
}
