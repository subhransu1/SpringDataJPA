package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	public List<Book> findByBookPrice(Double price);
	public List<Book> findByBookNameAndBookPrice(String name,Double price);
	public List<Book> findByBookPriceGreaterThanEqual(Double price);
}

