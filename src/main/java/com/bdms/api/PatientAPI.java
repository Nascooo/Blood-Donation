package com.bdms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdms.dto.PatientDTO;

@RequestMapping("api/v1/patient")
public interface PatientAPI {

	@PostMapping
	PatientDTO savePatient(PatientDTO patientDTO);

	@GetMapping("{id}")
	PatientDTO getPatient(@PathVariable(name = "id") Long patientId);
}
