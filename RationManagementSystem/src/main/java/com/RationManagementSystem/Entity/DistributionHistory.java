package com.RationManagementSystem.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "distribution_history")
public class DistributionHistory {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

//	    @OneToMany
//	    @Column(name="rationCardNo")
	    private String rationCardNo;

	    private Integer totalKg;

	    private Double totalAmount;

	    private LocalDateTime distributedAt;

	    
		public DistributionHistory() {
			
			// TODO Auto-generated constructor stub
		}


		public DistributionHistory(String rationCardNo, Integer totalKg, Double totalAmount,
				LocalDateTime distributedAt) {
			super();
			this.rationCardNo = rationCardNo;
			this.totalKg = totalKg;
			this.totalAmount = totalAmount;
			this.distributedAt = distributedAt;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getRationCardNo() {
			return rationCardNo;
		}


		public void setRationCardNo(String rationCardNo) {
			this.rationCardNo = rationCardNo;
		}


		public Integer getTotalKg() {
			return totalKg;
		}


		public void setTotalKg(Integer totalKg) {
			this.totalKg = totalKg;
		}


		public Double getTotalAmount() {
			return totalAmount;
		}


		public void setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
		}


		public LocalDateTime getDistributedAt() {
			return distributedAt;
		}


		public void setDistributedAt(LocalDateTime distributedAt) {
			this.distributedAt = distributedAt;
		}
	    
	    
}
