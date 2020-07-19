package com.cciv.demo.repository;

import com.cciv.demo.model.Patient;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "patients", path = "patients")
public interface PatientRepositoryRest extends PagingAndSortingRepository<Patient, Long> {

  List<Patient> findByFullName(@Param("full-name") String fullName);
}