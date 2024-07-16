package com.devprobootcamp.dvs.driver_violation_service.service;

import com.devprobootcamp.dvs.driver_violation_service.dto.CreateTicketDTO;
import com.devprobootcamp.dvs.driver_violation_service.dto.DriverLicenseDTO;
import com.devprobootcamp.dvs.driver_violation_service.model.TicketEntity;
import com.devprobootcamp.dvs.driver_violation_service.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TicketServiceImpl implements TicketService {

    private TicketRepository ticketRepository;
    private RestTemplate restTemplate;

    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository, @Qualifier("rt1") RestTemplate restTemplate) {
        this.ticketRepository = ticketRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public void createTicket(CreateTicketDTO ticket) {

        // call the dls with ticket
        // if 404 then error
        // if 200 the success

        restTemplate.getForObject("http://localhost:8080/license/api/number?lcn="+ticket.getLicenseNumber(), DriverLicenseDTO.class);

        TicketEntity ticketEntity = new TicketEntity();
        ticketEntity.setTicketDescription(ticket.getTicketDescription());
        ticketEntity.setAddress(ticket.getAddress());
        ticketEntity.setCourtDateTime(ticket.getCourtDateTime());
        ticketEntity.setLicenseNumber(ticket.getLicenseNumber());

        ticketRepository.save(ticketEntity);


    }

}
