package com.donation.blood;

import com.donation.blood.entities.Patient;
import com.donation.blood.entities.PatientAddress;
import com.donation.blood.repos.PatientAddressRepo;
import com.donation.blood.repos.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Arrays;
import java.util.Date;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BloodApplication implements CommandLineRunner {

	@Autowired
	PatientRepo patientRepo;

	@Autowired
	PatientAddressRepo patientAddressRepo;

	public static void main(String[] args) {
		SpringApplication.run(BloodApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Patient patient = new Patient();
		PatientAddress address = new PatientAddress();
		address.setCity("Cairo");
		address.setStreet("Tahrir St.");
		patient.setAddresses(Arrays.asList(patientAddressRepo.save(address)));
		patient.setCreationDate(new Date());
		patient.setFirstName("Ahmed");
		patient.setLastName("AbdEl nasser");
		patientRepo.save(patient);
	}
}
