package com.RationManagementSystem.Request;

import org.springframework.stereotype.Component;

@Component
public class RationCardRequest {
    
	private Long id;
	public String cardNumber;
	private String holderName;
    public String email;
    private String mobileNumber;
    private Integer familyMembersCount;
    
    
	public RationCardRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RationCardRequest(String cardNumber, String holderName, String email, String mobileNumber,
			Integer familyMembersCount) {
		
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.familyMembersCount = familyMembersCount;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getHolderName() {
		return holderName;
	}


	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Integer getFamilyMembersCount() {
		return familyMembersCount;
	}


	public void setFamilyMembersCount(Integer familyMembersCount) {
		this.familyMembersCount = familyMembersCount;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
    
    
}
