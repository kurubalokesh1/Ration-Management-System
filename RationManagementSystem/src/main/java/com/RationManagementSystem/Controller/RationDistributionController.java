package com.RationManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RationManagementSystem.Otp.EmailService;
import com.RationManagementSystem.Request.DistributionRationRequest;
import com.RationManagementSystem.Request.DistributionRequest;
import com.RationManagementSystem.Request.RationCardRequest;
import com.RationManagementSystem.Service.RationDistributionService;

@RestController
@RequestMapping("/ration")
public class RationDistributionController {

	@Autowired
	DistributionRationRequest request;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	RationCardRequest  cardRequest;
	
	@Autowired
	DistributionRequest dto;  // ration distribute items
	
	@PostMapping("/sendOtp")
	public String login(@RequestBody RationCardRequest  cardRequest) {
		
		return request.distributioRation(cardRequest.cardNumber, cardRequest.email);
		
	}
	
	@PostMapping("/verify")
	public String verifyOtp(String email,Integer userOtp) {
		return emailService.verifyOtp(email,userOtp);
		
	}
	
	
	@PostMapping("/distribute")
	public String distribute(@RequestBody DistributionRequest dto) {
		
		return request.rationDistribution(dto.cardNumber,dto.familyCnt,dto. item1, dto.item2);
		
	}
}
