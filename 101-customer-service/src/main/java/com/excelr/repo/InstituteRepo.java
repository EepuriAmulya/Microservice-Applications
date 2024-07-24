package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Institute;

@Repository
public interface InstituteRepo extends JpaRepository<Institute, Integer> {

}
