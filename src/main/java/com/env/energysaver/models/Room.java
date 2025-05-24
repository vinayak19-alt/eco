package com.env.energysaver.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomId;

	private String name;
	private Integer floor;
	private Boolean hasAc;
	private Boolean hasLights;
	private Boolean hasProjector;
	private Float currentEnergyUsageKwh;

	@ManyToOne
	@JoinColumn(name = "department_id", nullable = false)
	private Department department;

	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<Seat> seats = new ArrayList<>();
	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<RoomEnergyLog> roomEnergyLogs = new ArrayList<>();
	@OneToMany(mappedBy = "fromRoom", cascade = CascadeType.ALL)
	private List<EnergySavingLog> fromRoomLog;
	@OneToMany(mappedBy = "toRoom", cascade = CascadeType.ALL)
	private List<EnergySavingLog> toRoomLog;
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Room(Long roomId, String name, Integer floor, Boolean hasAc, Boolean hasLights, Boolean hasProjector,
			Float currentEnergyUsageKwh, Department department, List<Seat> seats, List<RoomEnergyLog> roomEnergyLogs,
			List<EnergySavingLog> fromRoomLog, List<EnergySavingLog> toRoomLog) {
		super();
		this.roomId = roomId;
		this.name = name;
		this.floor = floor;
		this.hasAc = hasAc;
		this.hasLights = hasLights;
		this.hasProjector = hasProjector;
		this.currentEnergyUsageKwh = currentEnergyUsageKwh;
		this.department = department;
		this.seats = seats;
		this.roomEnergyLogs = roomEnergyLogs;
		this.fromRoomLog = fromRoomLog;
		this.toRoomLog = toRoomLog;
	}
	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Boolean getHasAc() {
		return hasAc;
	}
	public void setHasAc(Boolean hasAc) {
		this.hasAc = hasAc;
	}
	public Boolean getHasLights() {
		return hasLights;
	}
	public void setHasLights(Boolean hasLights) {
		this.hasLights = hasLights;
	}
	public Boolean getHasProjector() {
		return hasProjector;
	}
	public void setHasProjector(Boolean hasProjector) {
		this.hasProjector = hasProjector;
	}
	public Float getCurrentEnergyUsageKwh() {
		return currentEnergyUsageKwh;
	}
	public void setCurrentEnergyUsageKwh(Float currentEnergyUsageKwh) {
		this.currentEnergyUsageKwh = currentEnergyUsageKwh;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public List<RoomEnergyLog> getRoomEnergyLogs() {
		return roomEnergyLogs;
	}
	public void setRoomEnergyLogs(List<RoomEnergyLog> roomEnergyLogs) {
		this.roomEnergyLogs = roomEnergyLogs;
	}
	public List<EnergySavingLog> getFromRoomLog() {
		return fromRoomLog;
	}
	public void setFromRoomLog(List<EnergySavingLog> fromRoomLog) {
		this.fromRoomLog = fromRoomLog;
	}
	public List<EnergySavingLog> getToRoomLog() {
		return toRoomLog;
	}
	public void setToRoomLog(List<EnergySavingLog> toRoomLog) {
		this.toRoomLog = toRoomLog;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", name=" + name + ", floor=" + floor + ", hasAc=" + hasAc + ", hasLights="
				+ hasLights + ", hasProjector=" + hasProjector + ", currentEnergyUsageKwh=" + currentEnergyUsageKwh
				+ ", department=" + department + ", seats=" + seats + ", roomEnergyLogs=" + roomEnergyLogs
				+ ", fromRoomLog=" + fromRoomLog + ", toRoomLog=" + toRoomLog + "]";
	}
	
	
}