package com.xworkz.PhonepeDTO;

public class PhonepeDTO {
	
	public static final String getName = null;
	private String name;
	private String email;
	private Long phoneNumber;
	private Long accountNumber;
	private String bankName;
	private String ifsc;
	private CarInsuranceDTO carinsuranceDTO;
	
	public PhonepeDTO() {
		System.out.println("Default no arg Constructor");
		}
	
	public PhonepeDTO(String name, String email, long l, Long accountNumber, String bankName, String ifsc,
			CarInsuranceDTO carInsuranceDTO1) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = l;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifsc = ifsc;
		this.carinsuranceDTO = carInsuranceDTO1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfsc() {
		return ifsc;
	}
		
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public CarInsuranceDTO getCarinsuranceDTO() {
		return carinsuranceDTO;
	}

	public void setCarinsuranceDTO(CarInsuranceDTO carinsuranceDTO) {
		this.carinsuranceDTO = carinsuranceDTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((carinsuranceDTO == null) ? 0 : carinsuranceDTO.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((ifsc == null) ? 0 : ifsc.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		PhonepeDTO other = (PhonepeDTO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null) {
				return false;
			}
		} else if (!accountNumber.equals(other.accountNumber)) {
			return false;
		}
		if (bankName == null) {
			if (other.bankName != null) {
				return false;
			}
		} else if (!bankName.equals(other.bankName)) {
			return false;
		}
		if (carinsuranceDTO == null) {
			if (other.carinsuranceDTO != null) {
				return false;
			}
		} else if (!carinsuranceDTO.equals(other.carinsuranceDTO)) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (ifsc == null) {
			if (other.ifsc != null) {
				return false;
			}
		} else if (!ifsc.equals(other.ifsc)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phoneNumber == null) {
			if (other.phoneNumber != null) {
				return false;
			}
		} else if (!phoneNumber.equals(other.phoneNumber)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PhonepeDTO [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", accountNumber="
				+ accountNumber + ", bankName=" + bankName + ", ifsc=" + ifsc + ", carinsuranceDTO=" + carinsuranceDTO
				+ "]";
	}
	
	
	
}
	