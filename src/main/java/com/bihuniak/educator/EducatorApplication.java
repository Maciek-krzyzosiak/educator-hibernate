package com.bihuniak.educator;

import com.bihuniak.educator.Human.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.time.LocalDate;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private HumanRepository humanRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Human janusz = new Human("Janusz",
				"Tkacz",
				Sex.SECRET,
				LocalDate.of(1980,10,10),
				new Address("Wagonowa", "Władysławowo", "POLAND"),
				asList("123456789","987654321"),
				asList(new Address("Cukierkowa", "Rokosowo", "POLAND"),
						new Address("Siemano", "Kolano", "AMERYCZKA"))
				);
		humanRepository.save(janusz);
	}
}
