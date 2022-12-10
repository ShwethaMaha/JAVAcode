package com.xworkz.isroService;


import com.xworkz.IsroException.InvalidDataException;
import com.xworkz.isrodto.IsroDTO;

public class ISROServiceImplementation implements ISROService {
	
	@Override
	public boolean checkdata(IsroDTO isrodto) throws InvalidDataException{
	 if(isrodto.getLocation()==null || isrodto.getNumberofemployees()==0){
		 System.out.println("Object is null");
	 }
	 if(isrodto.getLocation().length()>10) {
		 throw new InvalidDataException("Invalid data enter the correct data");
		 
	 }return false;
	}

	




	
}
