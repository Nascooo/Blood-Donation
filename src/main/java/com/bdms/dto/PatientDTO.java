package com.bdms.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class PatientDTO {

	private Long id;

	private String firstName;

	private String lastName;

	private LocalDate dateOfBirth;

	private String gender;

	private String bloodGroup;

	private String medicalHistory;

	private String contactPhone;

	private List<PatientAddressDTO> address;
}
