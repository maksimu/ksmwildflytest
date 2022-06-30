package com.example.demo;

import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Security;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {

		System.out.println("HI mom");
//		Security.addProvider(new BouncyCastleFipsProvider());

		SpringApplication.run(DemoApplication.class, args);
	}

}
