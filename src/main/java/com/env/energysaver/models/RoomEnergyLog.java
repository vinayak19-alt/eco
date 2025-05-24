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
@Table(name = "roomEnergyLog")
public class RoomEnergyLog {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long logId;
	
	private LocalDateTime timeStamp;
	
	private Float lightEnergyKwh;
	
	private Float acEnergyKwh;
	
	private Float projectorEnergyKwh;
	
	private Float totalEnergyKwh;
	
	@ManyToOne
	@JoinColumn(name = "room_id")
	private Room room;

	public RoomEnergyLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomEnergyLog(Long logId, LocalDateTime timeStamp, Float lightEnergyKwh, Float acEnergyKwh,
			Float projectorEnergyKwh, Float totalEnergyKwh, Room room) {
		super();
		this.logId = logId;
		this.timeStamp = timeStamp;
		this.lightEnergyKwh = lightEnergyKwh;
		this.acEnergyKwh = acEnergyKwh;
		this.projectorEnergyKwh = projectorEnergyKwh;
		this.totalEnergyKwh = totalEnergyKwh;
		this.room = room;
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

	public Float getLightEnergyKwh() {
		return lightEnergyKwh;
	}

	public void setLightEnergyKwh(Float lightEnergyKwh) {
		this.lightEnergyKwh = lightEnergyKwh;
	}

	public Float getAcEnergyKwh() {
		return acEnergyKwh;
	}

	public void setAcEnergyKwh(Float acEnergyKwh) {
		this.acEnergyKwh = acEnergyKwh;
	}

	public Float getProjectorEnergyKwh() {
		return projectorEnergyKwh;
	}

	public void setProjectorEnergyKwh(Float projectorEnergyKwh) {
		this.projectorEnergyKwh = projectorEnergyKwh;
	}

	public Float getTotalEnergyKwh() {
		return totalEnergyKwh;
	}

	public void setTotalEnergyKwh(Float totalEnergyKwh) {
		this.totalEnergyKwh = totalEnergyKwh;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "RoomEnergyLog [logId=" + logId + ", timeStamp=" + timeStamp + ", lightEnergyKwh=" + lightEnergyKwh
				+ ", acEnergyKwh=" + acEnergyKwh + ", projectorEnergyKwh=" + projectorEnergyKwh + ", totalEnergyKwh="
				+ totalEnergyKwh + ", room=" + room + "]";
	}
	
	
}