package com.excelr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
	
	public List<Payment> findByinstituteCenterId(int companyId);


}
