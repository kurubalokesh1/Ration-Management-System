package com.RationManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RationManagementSystemApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext c = SpringApplication.run(RationManagementSystemApplication.class, args);
	
//	otpCode a = c.getBean(otpCode.class);
//	a.otp();
	}

}
