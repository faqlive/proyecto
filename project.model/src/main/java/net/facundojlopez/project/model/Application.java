package net.facundojlopez.project.model;

import net.facundojlopez.project.model.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public List<User> initUsers(){
		List<User> users = new ArrayList();
		users.add(new User(1,"Facundo","facundo@mail.com", LocalDate.of(1986,11,27) ,"qweasd"));
		users.add(new User(2,"Sara","sara@mail.com", LocalDate.of(1986,11,27) ,"qweasd"));
		users.add(new User(3,"Melina","melina@mail.com", LocalDate.of(1986,11,27) ,"qweasd"));
		users.add(new User(4,"Maria","maria@mail.com", LocalDate.of(1986,11,27) ,"qweasd"));
		return users;
	}


}
