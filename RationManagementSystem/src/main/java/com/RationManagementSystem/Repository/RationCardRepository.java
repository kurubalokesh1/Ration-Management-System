package com.RationManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RationManagementSystem.Entity.RationCard;

@Repository
public interface RationCardRepository extends JpaRepository<RationCard,Long> {

	RationCard findByCardNumber(String card);
	
}
