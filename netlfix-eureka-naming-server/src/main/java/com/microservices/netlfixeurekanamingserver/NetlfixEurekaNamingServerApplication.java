package com.microservices.netlfixeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetlfixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetlfixEurekaNamingServerApplication.class, args);
	}

}
