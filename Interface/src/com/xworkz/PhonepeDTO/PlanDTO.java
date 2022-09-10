package com.xworkz.PhonepeDTO;

public class PlanDTO {
	
	private InsuranceCompany companyName;
	private double insuranceprice;
	private int yearCoverage;
	
	public PlanDTO() {
	System.out.println("Default no arg Constructor");
	}
	
	public PlanDTO(InsuranceCompany companyName, double insuranceprice, int yearCoverage) {
		super();
		this.companyName = companyName;
		this.insuranceprice = insuranceprice;
		this.yearCoverage = yearCoverage;
		
	}

	public PlanDTO(String iffcotokio, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public InsuranceCompany getCompanyName() {
		return companyName;
	}

	public void setCompanyName(InsuranceCompany companyName) {
		this.companyName = companyName;
	}

	public double getInsuranceprice() {
		return insuranceprice;
	}

	public void setInsuranceprice(double insuranceprice) {
		this.insuranceprice = insuranceprice;
	}

	public int getYearCoverage() {
		return yearCoverage;
	}

	public void setYearCoverage(int yearCoverage) {
		this.yearCoverage = yearCoverage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(insuranceprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + yearCoverage;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PlanDTO other = (PlanDTO) obj;
		if (companyName == null) {
			if (other.companyName != null) {
				return false;
			}
		} else if (!companyName.equals(other.companyName)) {
			return false;
		}
		if (Double.doubleToLongBits(insuranceprice) != Double.doubleToLongBits(other.insuranceprice)) {
			return false;
		}
		if (yearCoverage != other.yearCoverage) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PlanDTO [companyName=" + companyName + ", insuranceprice=" + insuranceprice + ", yearCoverage="
				+ yearCoverage + "]";
	}
	
	
	

}
