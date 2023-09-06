package com.bdms.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "patients")
public class Patients {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private Long patientId;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "date_of_birth", nullable = false)
	private LocalDate dateOfBirth;

	@Column(name = "gender", nullable = false)
	private String gender;

	@Column(name = "blood_group", nullable = false)
	private String bloodGroup;

	@Column(name = "medical_history", columnDefinition = "TEXT")
	private String medicalHistory;

	@Column(name = "contact_phone")
	private String contactPhone;

	@OneToMany
	private List<PatientAddress> address;
}
