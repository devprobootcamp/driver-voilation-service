package com.devprobootcamp.dvs.driver_violation_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateTicketDTO {

    @NotBlank(message = "licenseNumber is required")
    private String licenseNumber;

    @NotBlank(message = "Address is required")
    private String address;

    @NotNull(message = "courtDateTime required")
    private LocalDateTime courtDateTime;

    @NotBlank(message = "ticketDescription is required")
    private String ticketDescription;

}
