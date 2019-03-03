package com.cmarchive.bank.bankoauth2authorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class BankOauth2AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankOauth2AuthorizationServerApplication.class, args);
	}

}
