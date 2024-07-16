package com.devprobootcamp.dvs.driver_violation_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
@Data
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketNumber;

    private String address;

    private LocalDateTime courtDateTime;

    private String ticketDescription;

    private String licenseNumber;

}
