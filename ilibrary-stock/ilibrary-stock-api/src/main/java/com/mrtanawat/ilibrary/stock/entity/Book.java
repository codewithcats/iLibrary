package com.mrtanawat.ilibrary.stock.entity;

import java.math.BigDecimal;

public class Book {
	private int id;
	private String title;
	private BigDecimal price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
