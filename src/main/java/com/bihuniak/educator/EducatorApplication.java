package com.bihuniak.educator;

import com.bihuniak.educator.basic.car;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

@SpringBootApplication
public class EducatorApplication {

	@Autowired
	private MyFirstRepository myFirstRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
//		car car1 = new car("Audi", "A4", 4, 1.8, true);
//		car car2 = new car("BMW", "e36", 4, 1.6, true);
//		car car3 = new car("Mercedes", "Cle65", 4, 2.0, true);
//		car car4 = new car("Opel", "Astra", 4, 1.4, true);
//		myFirstRepository.saveAll(asList(car1,car2,car3,car4));

		car car = myFirstRepository.findById(4L).get();
		System.out.println(car);


	}
}
