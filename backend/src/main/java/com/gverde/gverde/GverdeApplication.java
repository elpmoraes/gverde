package com.gverde.gverde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GverdeApplication {

	public static void main(String[] args) {
		System.out.println("Ola Mundo");
		SpringApplication.run(GverdeApplication.class, args);
	}

}
