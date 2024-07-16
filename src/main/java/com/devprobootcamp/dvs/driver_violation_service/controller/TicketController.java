package com.devprobootcamp.dvs.driver_violation_service.controller;

import com.devprobootcamp.dvs.driver_violation_service.dto.CreateTicketDTO;
import com.devprobootcamp.dvs.driver_violation_service.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("violations/api")
public class TicketController {

    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping()
    public ResponseEntity<Void> createTicket(@RequestBody @Validated  CreateTicketDTO ticket) {
        ticketService.createTicket(ticket);
        return ResponseEntity.noContent().build();
    }
}
