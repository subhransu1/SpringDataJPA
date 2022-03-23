package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@SpringBootApplication
public class SpringBootDataJpaApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootDataJpaApp2Application.class, args);
		BookRepository repo = ctx.getBean(BookRepository.class);
		
				
		/*
		 * Book b1=new Book(001,"English",450.0); Book b2=new Book(002,"Math",500.0);
		 * Book b3=new Book(003,"Odia",600.0); Book b4=new Book(004,"Hindi",200.0);
		 * 
		 * 
		 * repo.save(b1);repo.save(b2);repo.save(b3);repo.save(b4);
		 */
		
		//System.out.println(repo.findByBookNameAndBookPrice("Odia", 600.0));
		//System.out.println(repo.findByBookPriceGreaterThanEqual(450.0));
		System.out.println(repo.findByBookPrice(500.0));
	}

}
