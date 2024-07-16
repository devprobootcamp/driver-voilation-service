package com.devprobootcamp.dvs.driver_violation_service.repository;

import com.devprobootcamp.dvs.driver_violation_service.model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Long> {
}
