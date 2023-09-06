package com.bdms.services;

import com.bdms.dto.PatientDTO;

public interface PatientService {

	PatientDTO savePatient(PatientDTO patientDTO);

	PatientDTO getPatientById(Long patientId);
}
