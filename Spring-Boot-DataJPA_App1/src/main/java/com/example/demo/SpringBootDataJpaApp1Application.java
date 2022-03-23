package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;

@SpringBootApplication
public class SpringBootDataJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootDataJpaApp1Application.class, args);
		
		
		/* For our repository interface ,data jpa will create implementation class using proxy design pattern.
		 * IOC will create the object for that proxy class.
		 */
		PlayerRepository Repo = ctx.getBean(PlayerRepository.class);
		
		Player p1=new Player();
		p1.setPlayer_id(003);
		p1.setPlayer_name("Indra");
		p1.setAge(24);
		p1.setCity("Mumbai");
		p1.setGender("Male");
		
		Repo.save(p1);
		
		System.out.println(Repo.findById(001).get());
		
	}

}
