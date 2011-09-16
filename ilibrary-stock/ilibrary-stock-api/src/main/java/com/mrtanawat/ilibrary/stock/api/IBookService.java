package com.mrtanawat.ilibrary.stock.api;

import com.mrtanawat.ilibrary.stock.entity.Book;

public interface IBookService {
	/**
	 * 
	 * @param book
	 * @return
	 * @throws Exception title = null or price = null
	 */
	public Book add(Book book) throws Exception;
}
