package com.bihuniak.educator;

import com.bihuniak.educator.Human.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.time.LocalDate;

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
				new Address("Wagonowa", "Władysławowo", "POLAND", new PostCode("12-439","Wrocław")));
		humanRepository.save(janusz);
	}
}
