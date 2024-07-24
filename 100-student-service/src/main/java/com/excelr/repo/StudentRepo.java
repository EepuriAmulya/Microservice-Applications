package com.excelr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	public List<Student> findByinstituteCenterId(int instituteCenterId);

	

}
