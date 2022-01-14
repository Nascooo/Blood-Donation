package com.donation.blood.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Data
@Document("patient")
public class Patient {

    @Id
    private String id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("registration_date")
    private Date creationDate;

    @Field("mobile_number")
    private String mobileNumber;

    @Field("last_donation_date")
    private Date lastDonationDate;

    @Field("eligible_to_donate")
    private Boolean eligibleToDonate;

    @Field("address")
    private List<PatientAddress> addresses;
}
