package com.env.energysaver.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "seat")
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seatId;

	@ManyToOne
	@JoinColumn(name = "room_id", nullable = false)
	private Room room;

	private String seatNumber;

	private Boolean isOccupied;
	
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Seat(Long seatId, Room room, String seatNumber, Boolean isOccupied) {
		super();
		this.seatId = seatId;
		this.room = room;
		this.seatNumber = seatNumber;
		this.isOccupied = isOccupied;
	}
	
	public Long getSeatId() {
		return seatId;
	}

	public void setSeatId(Long seatId) {
		this.seatId = seatId;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public Boolean getIsOccupied() {
		return isOccupied;
	}

	public void setIsOccupied(Boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", room=" + room + ", seatNumber=" + seatNumber + ", isOccupied=" + isOccupied
				+ "]";
	}
	
}