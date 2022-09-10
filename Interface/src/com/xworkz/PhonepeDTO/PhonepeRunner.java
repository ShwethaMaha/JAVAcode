package com.xworkz.PhonepeDTO;

import java.io.InvalidClassException;

import com.xworkx.PhonepeDAO.PhonePeDAO;
import com.xworkx.PhonepeDAO.PhonePeDAOImplementation;
import com.xworkz.Phonepe.Exceptions.ArrayFullException;
import com.xworkz.Phonpe.Services.PhonePeServices;
import com.xworkz.Phonpe.Services.PhonePeServicesImplementation;
import com.xworkz.Phonpe.Services.PhonepeServicesImplementation;

public class PhonepeRunner {
	
	public static void main(String[] args) {
		PlanDTO planDTO1 = new PlanDTO(InsuranceCompany.DIGITS, 3898,1);
		CarInsuranceDTO carInsuranceDTO1 = new CarInsuranceDTO("KA45A2563", "Siddu", "tata", 2019, planDTO1);
		PhonepeDTO PhonepeDTO1 = new PhonepeDTO("Shwetha", "shwetha95@gmail.com", 8548930321L, 13423456872L,
				"HDFC", "HDFC123456", carInsuranceDTO1);
		
		PlanDTO planDTO2 = new PlanDTO(InsuranceCompany.IFFCOTOKIO, 3898,1);
		CarInsuranceDTO carInsuranceDTO2 = new CarInsuranceDTO("KA45A8973", "Vinay", "bolero", 2019, planDTO1);
		PhonepeDTO PhonepeDTO2 = new PhonepeDTO("Jyothi", "jyo15@gmail.com", 6350898765L, 102347909L,
				"HDFC", "HDFC123456", carInsuranceDTO2);
		
		PlanDTO planDTO3 = new PlanDTO(InsuranceCompany.ICICI, 3898,1);
		CarInsuranceDTO carInsuranceDTO3 = new CarInsuranceDTO("KA45A8973", "Vinay", "bolero", 2019, planDTO1);
		PhonepeDTO PhonepeDTO3 = new PhonepeDTO("shalini", "sha18@gmail.com", 6792578354L, 209856787L,
				"ICICI", "ICICI123456", carInsuranceDTO3);
		
		PlanDTO planDTO4 = new PlanDTO(InsuranceCompany.RELIANCE, 3898,1);
		CarInsuranceDTO carInsuranceDTO4 = new CarInsuranceDTO("KA45A1973", "Vinay", "SUZUKI", 2019, planDTO1);
		PhonepeDTO PhonepeDTO4 = new PhonepeDTO("KAVYA", "kavya123@gmail.com", 9834567898l, 103347909L,
				"SBI", "SBI123456", carInsuranceDTO4);
		
		PlanDTO planDTO5 = new PlanDTO(InsuranceCompany.DIGITS, 3898,1);
		CarInsuranceDTO carInsuranceDTO5 = new CarInsuranceDTO("KA45A8973", "Vinay", "mahendra", 2019, planDTO1);
		PhonepeDTO PhonepeDTO5 = new PhonepeDTO("shalini", "sha18@gmail.com", 6792572354L, 2093856787L,
				"ICICI", "ICICI123456", carInsuranceDTO5);
		
		PlanDTO planDTO6 = new PlanDTO(InsuranceCompany.DIGITS, 3898,1);
		CarInsuranceDTO carInsuranceDTO6 = new CarInsuranceDTO("KA25A8973", "Prasad", "indica", 2019, planDTO1);
		PhonepeDTO PhonepeDTO36 = new PhonepeDTO("Bhuvana", "bhuvi12@gmail.com", 6792578357L, 2098567987L,
				"ICICI", "ICICI125656", carInsuranceDTO6);
		
		PhonePeDAO dao=new PhonePeDAOImplementation();
		PhonePeServices services = new PhonepeServicesImplementation(dao);
		
		try {
			services.validateAndSave(PhonepeDTO1);
		}catch(ArrayFullException e) {
			
		}catch(InvalidClassException e) {
			
		}
			 try {
				 services.validateAndSave(PhonepeDTO2);
			 }catch(ArrayFullException e) {
					
				}catch(InvalidClassException e) {
					
			 }
			 try {
				 services.validateAndSave(PhonepeDTO3);
			 }catch(ArrayFullException e) {
					
				}catch(InvalidClassException e) {
					
			 }
		
			 try {
				 services.validateAndSave(PhonepeDTO4);
			 }catch(ArrayFullException e) {
					
				}catch(InvalidClassException e) {
					
			 }
			 try {
				 services.validateAndSave(PhonepeDTO5);
			 }catch(ArrayFullException e) {
					
				}catch(InvalidClassException e) {
					
			 }
			 try {
				 services.validateAndSave(PhonepeDTO6);
				}catch(InvalidClassException e) {
					
			 }
			 /*
			 services.deleteDTO(013423456872L);
				services.findCompanyInsuranceByCarNumber("KA45A8973");
				services.findRegisteredYearOfCar("2019");
				services.findbankByPhoneNumber(6350898765L);	
				services.findPlanofcarInsuranceByCarNumber("KA45A8973");
				*/
	}

}
