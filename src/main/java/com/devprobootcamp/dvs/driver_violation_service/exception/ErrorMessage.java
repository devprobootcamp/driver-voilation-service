package com.devprobootcamp.dvs.driver_violation_service.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorMessage {
    private String error;
    private String path;
    private LocalDateTime timestamp;
}
