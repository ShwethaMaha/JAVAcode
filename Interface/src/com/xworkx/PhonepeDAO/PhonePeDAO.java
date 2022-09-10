package com.xworkx.PhonepeDAO;

import com.xworkz.PhonepeDTO.PhonepeDTO;

public interface PhonePeDAO {
	public abstract boolean save(PhonepeDTO phonepeDTO);
	public abstract boolean findDuplicate (PhonepeDTO phonepeDTO);
	public abstract boolean findPlanOfcarInsuranceByCarNumber(String carNum);
	public abstract boolean findRegisteredYearOfCar(String carNumber);
	public abstract boolean findbankByPhoneNumber(Long phonenumber);
	public abstract boolean findCompanyInsuranceByCarNumber(String carNumber);
	public abstract boolean delete(Long accountNum);
	public abstract boolean update(Long accountNum,PhonepeDTO dto);
	
	
}
