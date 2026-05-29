package com.RationManagementSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.RationManagementSystem.Entity.Stock;


@Repository
public interface StockRepository extends JpaRepository <Stock,Long> {

	
	Stock findByItemName(String itemName);
}
