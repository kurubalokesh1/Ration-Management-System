package com.RationManagementSystem.Exception;

import org.springframework.stereotype.Component;

@Component
public class RationCardNotFoundException extends RuntimeException  {

	public String getMessage() {
		
		return "Invalid ration Card number";
		
	}
}

