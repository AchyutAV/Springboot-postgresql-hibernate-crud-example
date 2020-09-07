package net.javaguides.springboot.exception;

import java.sql.Date;

public class ErrorDetails {
	private Date timeStamp;
	private String message;
	private String details;
	
	public ErrorDetails(java.util.Date date, String message, String details) {
		super();
		this.timeStamp = (Date) date;
		this.message = message;
		this.details = details;
	}
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
