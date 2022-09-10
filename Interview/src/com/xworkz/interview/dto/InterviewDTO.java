package com.xworkz.interview.dto;

public class InterviewDTO {
	
	private int id;
	private int intime;
	private int outtime;
	private String companyName;
	private int timings;
	private String candidateName;
	
	public InterviewDTO() {
		System.out.println("default No arg Constructor");
		
	}
	
	public InterviewDTO(int id, int intime, int outtime, String companyName, int timings, String candidateName) {
		super();
		this.id = id;
		this.intime = intime;
		this.outtime = outtime;
		this.companyName = companyName;
		this.timings = timings;
		this.candidateName = candidateName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIntime() {
		return intime;
	}

	public void setIntime(int intime) {
		this.intime = intime;
	}

	public int getOuttime() {
		return outtime;
	}

	public void setOuttime(int outtime) {
		this.outtime = outtime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getTimings() {
		return timings;
	}

	public void setTimings(int timings) {
		this.timings = timings;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "InterviewDTO [id=" + id + ", intime=" + intime + ", outtime=" + outtime + ", companyName=" + companyName
				+ ", timings=" + timings + ", candidateName=" + candidateName + "]";
	}
}
