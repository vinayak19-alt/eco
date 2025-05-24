package com.env.energysaver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaderBoard")
public class LeaderBoard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rankId;
	
	private Integer credits;
	
	private Integer isTied;
	@OneToOne
	@JoinColumn(name = "corporate_id")
	private Employee employee;
	public LeaderBoard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaderBoard(Long rankId, Integer credits, Integer isTied, Employee employee) {
		super();
		this.rankId = rankId;
		this.credits = credits;
		this.isTied = isTied;
		this.employee = employee;
	}
	public Long getRankId() {
		return rankId;
	}
	public void setRankId(Long rankId) {
		this.rankId = rankId;
	}
	public Integer getCredits() {
		return credits;
	}
	public void setCredits(Integer credits) {
		this.credits = credits;
	}
	public Integer getIsTied() {
		return isTied;
	}
	public void setIsTied(Integer isTied) {
		this.isTied = isTied;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "LeaderBoard [rankId=" + rankId + ", credits=" + credits + ", isTied=" + isTied + ", employee="
				+ employee + "]";
	}
	
	
}