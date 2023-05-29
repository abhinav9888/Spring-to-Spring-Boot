package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//@SpringBootApplication = @Configuration + @EnableAutoConfiguration + @ComponentScan
public class MainApp {

	public static void main(String[] args) {
		/*SpringApplication class allows to bootstrap 
		  and launch the spring application from a java main method*/
		SpringApplication.run(MainApp.class, args);

	}

}
