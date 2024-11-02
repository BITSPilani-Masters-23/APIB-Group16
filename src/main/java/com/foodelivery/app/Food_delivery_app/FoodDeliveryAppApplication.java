package com.foodelivery.app.Food_delivery_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FoodDeliveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryAppApplication.class, args);
	}

	@GetMapping("/example")
	public String example() {
		return "Hello, World!";
	}

}
