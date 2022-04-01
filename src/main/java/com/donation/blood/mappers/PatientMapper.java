package com.donation.blood.mappers;

import com.donation.blood.dto.PatientDTO;
import com.donation.blood.entities.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PatientMapper {

    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    PatientDTO fromEntityToDTO(Patient patient);

    Patient fromDTOtoEntity(PatientDTO patientDTO);
}
