package com.xworkz.Phonpe.Services;

import com.xworkz.Phonepe.Exceptions.InvalidDataException;
import com.xworkz.PhonepeDTO.PhonepeDTO;

public interface PhonePeServices {
	public abstract boolean validateAndSave(PhonepeDTO dto) throws InvalidDataException;
	public abstract boolean findDuplicate(PhonepeDTO dto);
	public abstract boolean validateAndUpdate(Long accountNum,PhonepeDTO dto) throws InvalidDataException;
	public abstract boolean deleteDTO(Long accountNum);
	public abstract boolean findCompanyInsuranceByCarNumber(String carNumber);
	public abstract boolean findRegisteredYearOfCar(String carNumber);
	public abstract boolean findbankByPhoneNumber(Long phonenUmber);
	public abstract boolean findPlanOfcarInsuranceByCarNumber(String carNum);
	

}
