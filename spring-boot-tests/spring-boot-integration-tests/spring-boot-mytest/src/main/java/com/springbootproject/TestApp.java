package com.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TestApp
@SpringBootApplication
public class TestApp {

	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
		System.out.println("这是测试项目");
	}

}
