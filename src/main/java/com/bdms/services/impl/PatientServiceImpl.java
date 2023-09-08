package com.bdms.services.impl;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bdms.dto.PatientDTO;
import com.bdms.entities.Patients;
import com.bdms.exception.BdmsException;
import com.bdms.mappers.PatientMapper;
import com.bdms.repos.PatientRepository;
import com.bdms.services.PatientService;

@Service
@Transactional(readOnly = true)
public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepository;

	private PatientMapper patientMapper;

	public PatientServiceImpl(PatientRepository patientRepository, PatientMapper patientMapper) {
		this.patientRepository = patientRepository;
		this.patientMapper = patientMapper;
	}

	@Override
	@Transactional
	public PatientDTO savePatient(PatientDTO patientDTO) {
		Patients patient = patientMapper.fromDTOtoEntity(patientDTO);
		Patients savedPatient = patientRepository.save(patient);
		return getPatientById(savedPatient.getId());
	}

	@Override
	public PatientDTO getPatientById(Long patientId) {
		Optional<Patients> optionalPatient = patientRepository.findById(patientId);
		return optionalPatient.map(patientMapper::fromEntityToDTO).orElseThrow(() -> new BdmsException("NOT_CREATED" , HttpStatus.NOT_FOUND));
	}
}
