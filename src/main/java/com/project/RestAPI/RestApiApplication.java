package com.project.RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RestApiApplication.class, args);
		System.out.println("Rest API");
		String s="NIdhi";
		if(s.equalsIgnoreCase("Nidhi"))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//System.out.println("Demo");
	}

}
