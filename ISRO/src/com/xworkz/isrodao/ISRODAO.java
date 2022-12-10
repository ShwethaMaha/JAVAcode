package com.xworkz.isrodao;

import com.xworkz.isrodto.IsroDTO;

public interface ISRODAO {
	public abstract boolean saveDTO(IsroDTO isrodto);
	default void show() {
		System.out.println("updated data");
	}
	
}
