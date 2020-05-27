package com.emarket.emarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableOAuth2Client
public class BuyerApplication {
	/**
	 * @Title: main
	 * <p>Description: cloud-buyer-service start
	 * </p>
	 * @author: chenbl
	 * @version 1.0
	 */
	public static void main(String[] args)throws Exception{
		SpringApplication.run(BuyerApplication.class, args);
	}
}
