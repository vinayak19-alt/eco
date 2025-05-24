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
@Table(name = "energySavingLog")
public class EnergySavingLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logId;
	
	private LocalDateTime timeStamp;
	private String actionType;
	private String actionDescription;
	private Float estimatedEnergySavedKwh;
	private Integer creditsEarned;
	
	@ManyToOne
	@JoinColumn(name = "corporate_id")
	private Employee employee;
	@ManyToOne
	@JoinColumn(name = "from_room_id")
	private Room fromRoom;
	@ManyToOne
	@JoinColumn(name = "to_room_id")
	private Room toRoom;
	
	public EnergySavingLog(Long logId, LocalDateTime timeStamp, String actionType, String actionDescription,
			Float estimatedEnergySavedKwh, Integer creditsEarned, Employee employee, Room fromRoom, Room toRoom) {
		super();
		this.logId = logId;
		this.timeStamp = timeStamp;
		this.actionType = actionType;
		this.actionDescription = actionDescription;
		this.estimatedEnergySavedKwh = estimatedEnergySavedKwh;
		this.creditsEarned = creditsEarned;
		this.employee = employee;
		this.fromRoom = fromRoom;
		this.toRoom = toRoom;
	}
	public EnergySavingLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Long getLogId() {
		return logId;
	}
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getActionDescription() {
		return actionDescription;
	}
	public void setActionDescription(String actionDescription) {
		this.actionDescription = actionDescription;
	}
	public Float getEstimatedEnergySavedKwh() {
		return estimatedEnergySavedKwh;
	}
	public void setEstimatedEnergySavedKwh(Float estimatedEnergySavedKwh) {
		this.estimatedEnergySavedKwh = estimatedEnergySavedKwh;
	}
	public Integer getCreditsEarned() {
		return creditsEarned;
	}
	public void setCreditsEarned(Integer creditsEarned) {
		this.creditsEarned = creditsEarned;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Room getFromRoom() {
		return fromRoom;
	}
	public void setFromRoom(Room fromRoom) {
		this.fromRoom = fromRoom;
	}
	public Room getToRoom() {
		return toRoom;
	}
	public void setToRoom(Room toRoom) {
		this.toRoom = toRoom;
	}
	@Override
	public String toString() {
		return "EnergySavingLog [logId=" + logId + ", timeStamp=" + timeStamp + ", actionType=" + actionType
				+ ", actionDescription=" + actionDescription + ", estimatedEnergySavedKwh=" + estimatedEnergySavedKwh
				+ ", creditsEarned=" + creditsEarned + ", employee=" + employee + ", fromRoom=" + fromRoom + ", toRoom="
				+ toRoom + "]";
	}
	
	
}