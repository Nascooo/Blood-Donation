package com.donation.blood.services;

import com.donation.blood.dto.PatientDTO;
import com.donation.blood.entities.Patient;
import com.donation.blood.mappers.PatientMapper;
import com.donation.blood.repos.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public PatientDTO getPatient(String patientId) {
        PatientDTO patientDTO = new PatientDTO();
        Optional<Patient> patient = patientRepo.findById(patientId);
        if (patient.isPresent()) {
            patientDTO = PatientMapper.INSTANCE.fromEntityToDTO(patient.get());
        }
        return patientDTO;
    }
}
