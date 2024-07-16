package com.devprobootcamp.dvs.driver_violation_service.service;

import com.devprobootcamp.dvs.driver_violation_service.dto.CreateTicketDTO;

public interface TicketService {

    void createTicket(CreateTicketDTO ticket);
}
