package com.env.energysaver.dto;
public class LeaderboardDto {
    private Long corporateId;
    private String name;
    private Integer totalCredits;

    public LeaderboardDto(Long corporateId, String name, Integer totalCredits) {
        this.corporateId = corporateId;
        this.name = name;
        this.totalCredits = totalCredits;
    }

	public LeaderboardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCorporateId() {
		return corporateId;
	}

	public void setCorporateId(Long corporateId) {
		this.corporateId = corporateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(Integer totalCredits) {
		this.totalCredits = totalCredits;
	}

	@Override
	public String toString() {
		return "LeaderboardDto [corporateId=" + corporateId + ", name=" + name + ", totalCredits=" + totalCredits + "]";
	}
    
    
}
