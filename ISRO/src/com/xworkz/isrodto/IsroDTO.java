package com.xworkz.isrodto;

public class IsroDTO {
	private  int numberofemployees;
	private  String Location;
	
	public IsroDTO(int numberofemployees, String location) {
		super();
		this.numberofemployees = numberofemployees;
		this.Location = location;
	}
	public  int getNumberofemployees() {
		return numberofemployees;
	}
	public void setNumberofemployees(int numberofemployees) {
		this.numberofemployees = numberofemployees;
	}
	public  String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	@Override
	public String toString() {
		return "ISRODTO [numberofemployees=" + numberofemployees + ", Location=" + Location + "]";
	}
	
  
  
  
  
  
  
}
