package com.bdms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bdms.entities.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Long> {

}
