package com.mrtanawat.ilibrary.web.action;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.mrtanawat.ilibrary.stock.api.IBookService;
import com.mrtanawat.ilibrary.stock.entity.Book;

public class AddBookAction {
	private String title;
	private BigDecimal price;
	private IBookService bookService;
	private static Logger logger = Logger.getLogger(AddBookAction.class);
	
	public String add() {
		Book book = new Book();
		book.setTitle(this.title);
		book.setPrice(this.price);
		try {
			this.bookService.add(book);
		} catch (Exception e) {
			logger.error("Cannot add book", e);
			return "failed";
		}
		
		return "success";
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

}
