package com.donation.blood.repos;

import com.donation.blood.entities.PatientAddress;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientAddressRepo extends MongoRepository<PatientAddress, String> {
}
