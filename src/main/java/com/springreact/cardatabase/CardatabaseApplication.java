package com.springreact.cardatabase;

import com.springreact.cardatabase.domain.CarRepository;
import com.springreact.cardatabase.domain.OwnerRepository;
import com.springreact.cardatabase.domain.UserRepository;
import com.springreact.cardatabase.entity.Car;
import com.springreact.cardatabase.entity.Owner;
import com.springreact.cardatabase.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			// Save demo data to database
			Owner owner1 = new Owner("John", "Amenechi");
			Owner owner2 = new Owner("Deyi", "Adebolu");
			ownerRepository.save(owner1);
			ownerRepository.save(owner2);


			carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner1));
			carRepository.save(new Car("Honda", "Pilot", "Red", "KKO-0213", 2019, 50000, owner2));
			carRepository.save(new Car("Mercedes Benz", "CLK", "White", "KKO-0214", 2020, 60000, owner2));

			userRepository.save(new User("user", new BCryptPasswordEncoder().encode("user"), "USER"));
			userRepository.save(new User("admin", new BCryptPasswordEncoder().encode("admin"), "ADMIN"));
		};
	}

}
