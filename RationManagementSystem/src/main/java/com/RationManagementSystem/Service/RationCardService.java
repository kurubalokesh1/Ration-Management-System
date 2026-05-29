package com.RationManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RationManagementSystem.Entity.RationCard;
import com.RationManagementSystem.Repository.RationCardRepository;

@Service
public class RationCardService {

	@Autowired
	RationCardRepository repository; // Repository interface
	
	public void saveCard(RationCard rationCard) {
		 
		rationCard.setStatus("PENDING"); // default status level
		
		repository.save(rationCard);
	}
}
