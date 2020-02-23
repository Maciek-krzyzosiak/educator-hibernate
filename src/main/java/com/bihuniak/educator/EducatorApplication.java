package com.bihuniak.educator;

import com.bihuniak.educator.Human.Address;
import com.bihuniak.educator.Human.Human;
import com.bihuniak.educator.Human.HumanRepository;
import com.bihuniak.educator.Human.Sex;
import com.bihuniak.educator.basic.car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.util.Date;

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
				new Date(1980, 10, 10),
				new Address("Wagonowa", "Wrocław", "POLAND", "44-444"));
		humanRepository.save(janusz);
	}
}
