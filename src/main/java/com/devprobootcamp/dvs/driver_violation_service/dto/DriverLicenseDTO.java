package com.devprobootcamp.dvs.driver_violation_service.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DriverLicenseDTO {
    private String licenseNumber;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String addressLine;
    private String city;
    private String state;
    private String zipCode;
    private LocalDate issuedDate;
    private LocalDate expirationDate;
    private String licenseType;
}
