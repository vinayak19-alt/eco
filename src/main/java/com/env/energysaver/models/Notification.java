package com.env.energysaver.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "notification")
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long notificationId;
	
	private String message;
	private Boolean isRead;
	private LocalDateTime timeStamp;
	@ManyToOne
	@JoinColumn(name = "corporate_id")
	private Employee employee;
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notification(Long notificationId, String message, Boolean isRead, LocalDateTime timeStamp,
			Employee employee) {
		super();
		this.notificationId = notificationId;
		this.message = message;
		this.isRead = isRead;
		this.timeStamp = timeStamp;
		this.employee = employee;
	}
	public Long getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getIsRead() {
		return isRead;
	}
	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Notification [notificationId=" + notificationId + ", message=" + message + ", isRead=" + isRead
				+ ", timeStamp=" + timeStamp + ", employee=" + employee + "]";
	}
	
	

}