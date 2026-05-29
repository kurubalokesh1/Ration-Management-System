package com.RationManagementSystem.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RationManagementSystem.Entity.RationCard;
import com.RationManagementSystem.Entity.Stock;
import com.RationManagementSystem.Repository.RationCardRepository;
import com.RationManagementSystem.Repository.StockRepository;

@Service
public class RationDistributionService {

	@Autowired
	StockRepository repository;
	
	@Autowired
	RationCardRepository rationRep;
	
	public void updateStock(String itemName) {
		
		Stock stock = repository.findByItemName(itemName);
		
		int currentQty = stock.getAvailableQty();
		
		if("Wheat".equalsIgnoreCase(itemName) ) {
		  
			stock.setAvailableQty(currentQty - 30);
			
		} else if("Sugar".equalsIgnoreCase(itemName)) {
		
			stock.setAvailableQty(currentQty - 25);
			
		} else {
			stock.setAvailableQty(currentQty - (4*5));
		}
		
		//stock.set
		repository.save(stock);
	}
	
	public void statusUpdate(String card) {
		
	RationCard status =	rationRep.findByCardNumber(card);
	
	status.setStatus("Approved");
	
	rationRep.save(status);
//	return "Ration took successfully" ;
	
	}
}
