package com.donation.blood.controllers;

import com.donation.blood.dto.PatientDTO;
import com.donation.blood.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/")
    public PatientDTO getPatient(@RequestParam("patientId") String patientId) {
        return patientService.getPatient(patientId);
    }

    @PostMapping
    public PatientDTO savePatient(@RequestBody PatientDTO patientDTO) {
        return patientService.savePatient(patientDTO);
    }


}
