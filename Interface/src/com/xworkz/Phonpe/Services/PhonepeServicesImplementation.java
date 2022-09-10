package com.xworkz.Phonpe.Services;

import java.util.Date;

import com.xworkx.PhonepeDAO.PhonePeDAO;
import com.xworkz.Phonepe.Exceptions.InvalidDataException;
import com.xworkz.PhonepeDTO.PhonepeDTO;

public class PhonepeServicesImplementation implements PhonePeServices{
	private PhonePeDAO dao;
	public PhonepeServicesImplementation(PhonePeDAO daos) {
		this.dao= daos;
		
	}
	public boolean validateAndSave(PhonepeDTO dto) throws InvalidDataException{
		if(dto!=null) {
			if(dto.getName()==null||dto.getName.isEmpty()|| !dto.getEmail().endsWith("gmail.com")) {
				throw new InvalidDataException("Invalid Data exception");
			}
			if (dto.getEmail().length() < 5 || !dto.getEmail().contains("@") || !dto.getEmail().endsWith("gmail.com")) {
				throw new InvalidDataException("email is not valid");
			}
			if (!dto.getPhoneNumber().toString().matches("^[789]\\d{9}$")) {
				throw new InvalidDataException("phone number is not valid");
			}
			if (!dto.getAccountNumber().toString().matches("^[0123456789]\\d{10}$")) {
				throw new InvalidDataException("account number is not valid");
			}
			if (dto.getBankName() == null || dto.getBankName().length() < 3
					|| dto.getBankName().matches("^[a-zA-Z]$")) {
				throw new InvalidDataException("bank name is not valid");
			}
			if (dto.getCarinsuranceDTO() == null) {
				throw new InvalidDataException("Do not pass null");
			}
			if (dto.getCarinsuranceDTO().getCarNumber().matches("^[a-zA-Z][a-zA-Z]\\[0-9][0-9]\\[a-zA-Z]\\d{4}$")) {
				throw new InvalidDataException("Invalid Format of car number");
			}
			if (dto.getCarinsuranceDTO().getCarName() == null || dto.getCarinsuranceDTO().getCarName().isEmpty()
					|| dto.getCarinsuranceDTO().getCarName().length() < 3) {
				throw new InvalidDataException("invalid Car name");
			}
			if (dto.getCarinsuranceDTO().getModel() == null || dto.getCarinsuranceDTO().getModel().length() < 3) {
				throw new InvalidDataException("Invalid model number");

			}

			if (dto.getCarinsuranceDTO().getRegisteredYear() > new Date().getYear() + 1900) {
				throw new InvalidDataException("Year is not valid");
			}

			if (dto.getCarinsuranceDTO().getPlanDTO() == null) {
				throw new InvalidDataException("Do not pass null");

			}
			if (dto.getCarinsuranceDTO().getPlanDTO().getCompanyName() == null) {
				throw new InvalidDataException("Invalid Company name");
			}
			if (dto.getCarinsuranceDTO().getPlanDTO().getInsuranceprice() < 500) {
				throw new InvalidDataException("Invalid price");
			}
			if (dto.getCarinsuranceDTO().getPlanDTO().getYearCoverage() <= 0) {
				throw new InvalidDataException("invalid coverage year");
			}

			boolean isDuplicate = findDuplicate(dto);
			if (!isDuplicate) {
				boolean isSave = dao.save(dto);
				if (isSave) {
					return true;
				}
			} else {
				System.out.println("Duplicate found. cannot save");
				return false;
			}

		}
		System.out.println("Do not pass null. cannot save");
		return false;
	}

	@Override
	public boolean findDuplicate(PhonepeDTO dto) {
		return dao.findDuplicate(dto);

	}

	@Override
	public boolean validateAndUpdate(Long accountNum, PhonepeDTO dto) throws InvalidDataException {
		if(dto!=null)
		{
			boolean isDuplicate=findDuplicate(dto);
			if(!isDuplicate)
			{
				if (dto.getName() == null || dto.getName().isEmpty() || dto.getName().length() < 3) {
					throw new InvalidDataException("Invalid Data exception");
				}
				if (dto.getEmail().length() < 5 || !dto.getEmail().contains("@") || !dto.getEmail().endsWith("gmail.com")) {
					throw new InvalidDataException("email is not valid");
				}
				if (!dto.getPhoneNumber().toString().matches("^[789]\\d{9}$")) {
					throw new InvalidDataException("phone number is not valid");
				}
				if (!dto.getAccountNumber().toString().matches("^[0123456789]\\d{10}$")) {
					throw new InvalidDataException("account number is not valid");
				}
				if (dto.getBankName() == null || dto.getBankName().length() < 3
						|| dto.getBankName().matches("^[a-zA-Z]$")) {
					throw new InvalidDataException("bank name is not valid");
				}
				if (dto.getCarinsuranceDTO() == null) {
					throw new InvalidDataException("Do not pass null");
				}
				if (dto.getCarinsuranceDTO().getCarName().matches("^[a-zA-Z][a-zA-Z]\\[0-9][0-9]\\[a-zA-Z]\\d{4}$")) {
					throw new InvalidDataException("Invalid Format of car number");
				}
				if (dto.getCarinsuranceDTO().getCarName() == null || dto.getCarinsuranceDTO().getCarName().isEmpty()
						|| dto.getCarinsuranceDTO().getCarName().length() < 3) {
					throw new InvalidDataException("invalid Car name");
				}
				if (dto.getCarinsuranceDTO().getModel() == null || dto.getCarinsuranceDTO().getModel().length() < 3) {
					throw new InvalidDataException("Invalid model number");

				}

				if (dto.getCarinsuranceDTO().getRegisteredYear() > new Date().getYear() + 1900) {
					throw new InvalidDataException("Year is not valid");
				}

				if (dto.getCarinsuranceDTO().getPlanDTO() == null) {
					throw new InvalidDataException("Do not pass null");

				}
				if (dto.getCarinsuranceDTO().getPlanDTO().getCompanyName() == null) {
					throw new InvalidDataException("Invalid Company name");
				}
				if (dto.getCarinsuranceDTO().getPlanDTO().getInsuranceprice() < 500) {
					throw new InvalidDataException("Invalid price");
				}
				if (dto.getCarinsuranceDTO().getPlanDTO().getYearCoverage() <= 0) {
					throw new InvalidDataException("invalid coverage year");
				}
				
				dao.update(accountNum, dto);
				return true;

			}
		}
		System.out.println("Do not pass null");
		return false;
	}

	@Override
	public boolean deleteDTO(Long accountNum) {
		
		return dao.delete(accountNum);
	}

	@Override
	public boolean findCompanyInsuranceByCarNumber(String carNumber) {
		return dao.findCompanyInsuranceByCarNumber(carNumber);
		
	}

	@Override
	public boolean findRegisteredYearOfCar(String carNumber) {
		// TODO Auto-generated method stub
		return dao.findRegisteredYearOfCar(carNumber);
	}

	@Override
	public boolean findbankByPhoneNumber(Long phoneNumber) {
		
		return dao.findbankByPhoneNumber(phoneNumber);
	}

	@Override
	public boolean findPlanOfcarInsuranceByCarNumber(String carNum) {
		
		return dao.findPlanOfcarInsuranceByCarNumber(carNum);
		}
	
	
	}
