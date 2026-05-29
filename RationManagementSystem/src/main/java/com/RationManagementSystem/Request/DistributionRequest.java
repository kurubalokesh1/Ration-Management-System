package com.RationManagementSystem.Request;

import org.springframework.stereotype.Component;

@Component
public class DistributionRequest {

	public Integer familyCnt;
	
	public String item1;
	
	public String item2;

	public String cardNumber;

	public DistributionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFamilyCnt() {
		return familyCnt;
	}

	public void setFamilyCnt(Integer familyCnt) {
		this.familyCnt = familyCnt;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
}
