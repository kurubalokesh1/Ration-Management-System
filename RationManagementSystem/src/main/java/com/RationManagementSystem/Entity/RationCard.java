package com.RationManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ration_cards")
public class RationCard {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String cardNumber;

	    private String holderName;

	    private String email;

	    private String mobileNumber;
	    
	    private Integer familyMembersCount;

	    private String status = "PENDING";

	    
		public RationCard() {
			
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
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


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public RationCard(String cardNumber, String holderName, String email, String mobileNumber,
				Integer familyMembersCount, String status) {
			
			this.cardNumber = cardNumber;
			this.holderName = holderName;
			this.email = email;
			this.mobileNumber = mobileNumber;
			this.familyMembersCount = familyMembersCount;
			this.status = status;
		} 
	    
	    

}
