package com.donation.blood.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PatientDTO {

    private String id;

    private String firstName;

    private String lastName;

    private Date creationDate;

    private String mobileNumber;

    private Date lastDonationDate;

    private Boolean eligibleToDonate;

    private List<PatientAddressDTO> addresses;
}
