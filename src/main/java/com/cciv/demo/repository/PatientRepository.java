package com.cciv.demo.repository;

import java.util.List;

import com.cciv.demo.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
  List<Patient> findByFullName(String fullName);

  Patient findById(long id);
}