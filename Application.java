package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	private static String URL = www.google.com;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//His-100 related changes
	public void doProcess() {
		// logic
		
	}
	public void loadData() {
		// logic
		//feature-202:changes
	}


}
