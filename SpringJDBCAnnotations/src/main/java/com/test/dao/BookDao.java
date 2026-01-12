package com.test.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.test.Book;
import com.test.BookMapper;

@Component
public class BookDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public BookDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public boolean createBook(Book book) {
		String sql = "insert into book2(b_name,b_price) values(?,?)";
		return jdbcTemplate.update(sql,book.getB_name(),book.getB_price()) > 0;
	}
	
	public List<Book> getAllBooks()
	{
		String sql = "select * from book2";
		return jdbcTemplate.query(sql,new BookMapper());
	}
	
	
}
