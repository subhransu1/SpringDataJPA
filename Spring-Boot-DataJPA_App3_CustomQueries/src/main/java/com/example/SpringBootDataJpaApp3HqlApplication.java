package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@SpringBootApplication
public class SpringBootDataJpaApp3HqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaApp3HqlApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		List<Book> allBooks = repository.getAllBooks();
		List<Book> allBooksNative = repository.getAllBooksNative();

		allBooksNative.forEach(e -> System.out.println(e));

	}

}
