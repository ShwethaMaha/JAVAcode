package com.xworkz.isrodao;

import com.xworkz.isrodto.IsroDTO;

public class ISRODAOImplementation implements ISRODAO{
	public IsroDTO[] idto=new IsroDTO[5];
	int index=0;
	@Override
	public boolean saveDTO(IsroDTO isrodto) {
		// TODO Auto-generated method stub
		if(isrodto==null) {
			System.out.println("Object is null");
	} else if(this.index<this.idto.length) {
		this.idto[index]=isrodto;
		System.out.println("array object is:"+index);
		this.index++;
		return true;
	}
	else {
		System.out.println("array is full");
	}
		return false;
	}
	

}
