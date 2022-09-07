package com.project.code.webservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ErrorDetails {
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
	
	public ErrorDetails(LocalDateTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
	public final LocalDateTime getTimestamp() {
		return timestamp;
	}
	public final String getMessage() {
		return message;
	}
	public final String getDetails() {
		return details;
	}
	
	
	
}
