package com.xworkz.isrorunner;

import com.xworkz.IsroException.InvalidDataException;
import com.xworkz.isroService.ISROService;
import com.xworkz.isroService.ISROServiceImplementation;
import com.xworkz.isrodao.ISRODAO;
import com.xworkz.isrodao.ISRODAOImplementation;
import com.xworkz.isrodto.IsroDTO;

public class ISRORunner {
	public static void main(String[] agrs) throws InvalidDataException {
		IsroDTO isrodto = new IsroDTO(45, "Bangalore");
		ISRODAO dao  = new ISRODAOImplementation();
		dao.show();
		dao.saveDTO(isrodto);
		IsroDTO isrodto1 = new IsroDTO(45, "Bangalore");
		IsroDTO isrodto2 = new IsroDTO(45, "Bangalore");
		IsroDTO isrodto3 = new IsroDTO(45, "Bangalore");
		IsroDTO isrodto4 = new IsroDTO(45, "Bangalore");
		IsroDTO isrodto5 = new IsroDTO(45, "Bangalore");
		
		dao.saveDTO(isrodto1);
		dao.saveDTO(isrodto2);
		dao.saveDTO(isrodto3);
		dao.saveDTO(isrodto4);
		dao.saveDTO(isrodto5);
		
		ISROService services=new ISROServiceImplementation();
		services.checkdata(isrodto);
		dao.saveDTO(isrodto);
		services.checkdata(isrodto1);
		dao.saveDTO(isrodto1);
		services.checkdata(isrodto2);
		dao.saveDTO(isrodto2);
		services.checkdata(isrodto3);
		dao.saveDTO(isrodto3);
		services.checkdata(isrodto4);
		dao.saveDTO(isrodto4);
		services.checkdata(isrodto5);
		dao.saveDTO(isrodto5);
		
		
		}

}
