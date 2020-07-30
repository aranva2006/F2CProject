package com.f2c.prodmaint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@EnableAutoConfiguration
@ComponentScan*/
@SpringBootApplication(scanBasePackages= {"com.f2c.prodmaint.resourceserver.config", "com.f2c.prodmaint.controller", "com.f2c.prodmaint.component"})
public class Application{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
