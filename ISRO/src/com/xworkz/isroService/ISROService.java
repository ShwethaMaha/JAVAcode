package com.xworkz.isroService;

import com.xworkz.IsroException.InvalidDataException;
import com.xworkz.isrodto.IsroDTO;

public interface ISROService {
	public abstract boolean checkdata(IsroDTO isrodto) throws InvalidDataException;

}
