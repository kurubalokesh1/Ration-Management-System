package com.RationManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RationManagementSystem.Entity.DistributionHistory;

@Repository
public interface DistributionHistoryRepository extends JpaRepository <DistributionHistory,Long> {

}
