package com.bdms.controllers;

import com.bdms.api.PatientAPI;
import com.bdms.dto.PatientDTO;
import com.bdms.services.PatientService;

import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController implements PatientAPI {

	private PatientService patientService;

	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}

	@PostMapping
	public PatientDTO savePatient(@RequestBody PatientDTO patientDTO) {
		return patientService.savePatient(patientDTO);
	}

	@Override
	public PatientDTO getPatient(Long patientId) {
		return patientService.getPatientById(patientId);
	}
}
