package com.RationManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long itemId;

	    private String itemName;

	    private Integer availableQty;

	    private Double unitPrice;

	    private Integer distributeQty;

		public Stock() {
			
			// TODO Auto-generated constructor stub
		}

		public Stock(String itemName, Integer availableQty, Double unitPrice, Integer distributeQty) {
			super();
			this.itemName = itemName;
			this.availableQty = availableQty;
			this.unitPrice = unitPrice;
			this.distributeQty = distributeQty;
		}

		public Long getItemId() {
			return itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public Integer getAvailableQty() {
			return availableQty;
		}

		public void setAvailableQty(Integer availableQty) {
			this.availableQty = availableQty;
		}

		public Double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(Double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public Integer getDistributeQty() {
			return distributeQty;
		}

		public void setDistributeQty(Integer distributeQty) {
			this.distributeQty = distributeQty;
		}
		
		

}	