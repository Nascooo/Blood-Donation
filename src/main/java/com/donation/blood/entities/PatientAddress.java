package com.donation.blood.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("patient_address")
public class PatientAddress {

    @Id
    private String id;

    @Field("city")
    private String city;

    @Field("street")
    private String street;

}
