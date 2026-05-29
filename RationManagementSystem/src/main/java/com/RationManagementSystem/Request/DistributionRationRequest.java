package com.RationManagementSystem.Request;

import javax.smartcardio.CardNotPresentException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.RationManagementSystem.Entity.RationCard;
import com.RationManagementSystem.Entity.Stock;
import com.RationManagementSystem.Exception.RationCardNotFoundException;
import com.RationManagementSystem.Otp.EmailService;
import com.RationManagementSystem.Repository.RationCardRepository;
import com.RationManagementSystem.Repository.StockRepository;
import com.RationManagementSystem.Service.RationDistributionService;

@Component
public class DistributionRationRequest {

	@Autowired
	EmailService mail;
	
	
	RationCard card;
	
	@Autowired
	RationCardRequest cardRequest;
	
	@Autowired
	StockRepository repository;
	
	@Autowired
	RationDistributionService distribution;
	
	@Autowired
	RationCardRepository cardRep;
	
	int amount;
	int wheat;
	int sugar;
	
	public String distributioRation(String cardNumber,String email) {
		
		try {
			
			if(!cardRep.findByCardNumber(cardNumber).getCardNumber().equalsIgnoreCase(cardNumber)) {
				throw new RationCardNotFoundException();
			}
			
//			
		} catch(RationCardNotFoundException e) {
			return e.getMessage();
		}
		return mail.sendOtp(email);	
	}
	
	public String rationDistribution(String cardNumber,Integer familyCnt,String item1,String item2) {
		
			
			Integer rice = familyCnt*5;
			distribution.updateStock("rice");
			
			if(item1.equalsIgnoreCase("Wheat")) {
				distribution.updateStock(item1);
			    wheat = 25;
			
			} 
			
			if (item2.equalsIgnoreCase("Sugar")) {
				distribution.updateStock(item2);
				 sugar = 28; 
			}
			
			amount += sugar + rice + wheat;

		//return distribution.statusUpdate(cardNumber);
			distribution.statusUpdate(cardNumber);
		    return "Ration distributed successfully.\n" + "Total Bill: ₹" + amount;
			
		
	}
}
