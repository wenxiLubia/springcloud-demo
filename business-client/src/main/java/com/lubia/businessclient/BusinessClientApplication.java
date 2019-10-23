package com.lubia.businessclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusinessClientApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(BusinessClientApplication.class, args);
	}

}
