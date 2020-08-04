package com.f2c.custmaint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication(scanBasePackages= {"com.f2c.custmaint.controller", "com.f2c.custmaint.component"})*/
@SpringBootApplication
public class Application{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
