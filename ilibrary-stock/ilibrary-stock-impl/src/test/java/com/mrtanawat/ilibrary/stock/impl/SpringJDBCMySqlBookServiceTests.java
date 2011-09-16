package com.mrtanawat.ilibrary.stock.impl;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.ExpectedException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import com.mrtanawat.ilibrary.stock.entity.Book;

@ContextConfiguration(locations="/beans.xml")
public class SpringJDBCMySqlBookServiceTests
	extends AbstractTransactionalJUnit4SpringContextTests {
	
	private static final String BOOKS_TABLE = "STOCK_BOOKS";
	
	@Autowired
	private SpringJDBCMySqlBookService bookService;
	
	@Test
	public void add() {
		Book book = new Book();
		book.setTitle("Example Title");
		book.setPrice(new BigDecimal(34.5d));
		
		Book addedBook = bookService.add(book);
		Assert.assertNotNull("newly book must have new id", addedBook.getId());
		BookRowMapper rowMapper = new BookRowMapper();
		String sql = "SELECT * FROM "+ BOOKS_TABLE +" WHERE ID = ?";
		Book queryBook = 
			simpleJdbcTemplate.queryForObject(sql , rowMapper, addedBook.getId());
		Assert.assertEquals(addedBook.getTitle(), queryBook.getTitle());
		Assert.assertEquals(addedBook.getPrice(), queryBook.getPrice());
	}
	
	@Test
	@ExpectedException(Exception.class)
	public void addWithNullTitle() {
		
	}
}
