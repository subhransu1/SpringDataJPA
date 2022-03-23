package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	@Query("from Book")
	public List<Book> getAllBooks();

	@Query(value="select * from book_info",nativeQuery = true) //if we don't mention nativeQuery=true ,it will be consider as HQL
	public List<Book> getAllBooksNative();

}

