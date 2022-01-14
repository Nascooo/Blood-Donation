package com.donation.blood.repos;

import com.donation.blood.entities.PatientAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientAddressRepo extends MongoRepository<PatientAddress , Long> {
}
