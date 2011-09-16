package com.mrtanawat.ilibrary.stock.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.mrtanawat.ilibrary.stock.entity.Book;

public class BookRowMapper implements ParameterizedRowMapper<Book> {

	@Override
	public Book mapRow(ResultSet resultSet, int rowIndex) throws SQLException {
		Book book = new Book();
		book.setId(resultSet.getInt("id"));
		book.setTitle(resultSet.getString("title"));
		book.setPrice(resultSet.getBigDecimal("price"));
		return book;
	}

}
