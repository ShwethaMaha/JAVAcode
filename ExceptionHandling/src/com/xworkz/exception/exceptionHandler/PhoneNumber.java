package com.xworkz.exception.exceptionHandler;

public class PhoneNumber {
		long number;
		int count=0; 
		public void checknumber(long number) throws InvaidNumber{
			try {
				if(count==0 || count<10) {
					System.out.println("enter the 10 digit number");
				}
				else {
					System.out.println("enter number is correct");
				}
			}
			catch(InvalidNumber e) {
				System.out.println("Invalidnumber");
			}
			public void getdigit(long number1){
				while(number1!=0) {
					number=number%10;
					number=number/10;
					count++;
					}
				}
		}
}
