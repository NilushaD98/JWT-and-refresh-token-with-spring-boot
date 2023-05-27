
package com.example.OlympicDatabase;

import com.example.OlympicDatabase.domain.Role;
import com.example.OlympicDatabase.domain.User;
import com.example.OlympicDatabase.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class OlympicDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlympicDatabaseApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null,"ROLE_USER"));
//			userService.saveRole(new Role(null,"ROLE_MANAGER"));
//			userService.saveRole(new Role(null,"ROLE_ADMIN"));
//			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null,"Nilusha Dissanayaka","NilushaD","1234",new ArrayList<>()));
//			userService.saveUser(new User(null,"Heshan Thathsara","HeshanT","1234",new ArrayList<>()));
//			userService.saveUser(new User(null,"Keshan Lahiru","KeshanL","1234",new ArrayList<>()));
//			userService.saveUser(new User(null,"Fahim Fa","FahimF","1234",new ArrayList<>()));
//
//			userService.addRoleToUser("NilushaD","ROLE_USER");
//			userService.addRoleToUser("HeshanT","ROLE_MANAGER");
//			userService.addRoleToUser("KeshanL","ROLE_ADMIN");
//			userService.addRoleToUser("FahimF","ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("FahimF","ROLE_ADMIN");
//			userService.addRoleToUser("FahimF","ROLE_USER");
//		};
//	}


}
