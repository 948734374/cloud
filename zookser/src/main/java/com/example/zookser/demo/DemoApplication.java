package com.example.zookser.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DemoApplication.class, args);
			System.out.println("Server startup done.");
		}catch (Exception e){
			System.out.println("Server startup fail.");
			e.printStackTrace();
		}

	}

}
