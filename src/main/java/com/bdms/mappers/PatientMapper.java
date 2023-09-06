package com.bdms.mappers;

import com.bdms.dto.PatientDTO;
import com.bdms.entities.Patients;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "Spring")
public interface PatientMapper {

	PatientDTO fromEntityToDTO(Patients patients);

	Patients fromDTOtoEntity(PatientDTO patientDTO);
}
