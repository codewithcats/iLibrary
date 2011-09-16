package com.mrtanawat.ilibrary.stock.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.mrtanawat.ilibrary.stock.api.IBookService;
import com.mrtanawat.ilibrary.stock.entity.Book;

public class SpringJDBCMySqlBookService 
	implements IBookService {

	private SimpleJdbcTemplate jdbcTemplate;
	private BookRowMapper bookRowMapper;
	
	public SpringJDBCMySqlBookService() {
		this.bookRowMapper = new BookRowMapper();
	}
	
	@Override
	public Book add(Book book) {
		String sql = "INSERT INTO STOCK_BOOKS (TITLE, PRICE) VALUES (?, ?)";
		jdbcTemplate.update(sql, book.getTitle(), book.getPrice());
		sql = "SELECT * FROM STOCK_BOOKS WHERE ID = LAST_INSERT_ID()";
		book = jdbcTemplate.queryForObject(sql, this.bookRowMapper);
		return book;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

}
