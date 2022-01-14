package com.donation.blood.repos;

import com.donation.blood.entities.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends MongoRepository<Patient, Long> {
}
