package com.xworkz.interview.dao;

import com.xworkz.interview.dto.InterviewDTO;

public abstract class InterviewDAOImplementation extends InterviewDAO{
 private InterviewDTO[] i=new InterviewDTO[3];
 	private int count=0;
	private int length;
	private Object b;
 	
 
	@Override
	public boolean save(InterviewDTO dto) {
		// TODO Auto-generated method stub
		if(dto==null) {
			System.out.println("cannot pass null");
			return false;
		}
		boolean is = findDuplicate(dto);
		if(is==true) {
			System.out.println("dto is already saved in array so cannot restore");
			return false;
		}
		if(count<i.length) {
			i[count]=dto;
			System.out.println("Succesfully added the dto at the index:"+count);
			count++;
			return true;
		}
		System.out.println("array is full");
		return false;
	}

	@Override
	public boolean findDuplicate(InterviewDTO dto) {
		// TODO Auto-generated method stub
		if(dto==null) {
			System.out.println("cannot pass null");
		return false;
		}
		for(int a=0;a<i.length;a++) {
			if(dto.equals(i[a])) {
				System.out.println("Duplicate found");
				return true;
			}
		} System.out.println("Duplicate Not Found");
		return false;
	}

	@Override
	public boolean Update(InterviewDTO dto) {
		// TODO Auto-generated method stub
		if(dto==null) {
			System.out.println("cannot pass null");
			return false;
}
			for(int b=0;b<this.length;b++)
			{
				if(this.b!=null  && this.b[a].getname().equals(name))
				{
					b[i]=dto;
					System.out.println("Updated Name");
					return true;
				}
			}
			return false;
	}
	

	@Override
	public boolean Dlete(String candidateName) {
		if(candidateName==null)
		{
			System.out.println("cannot be null");
			return false;
}
			for(int b=0;b<this.length;b++)
			{
				if(this.b!=null  && this.b[a].getcandidateName().equals(candidateName))
				{
					a[i]=dto;
					System.out.println("deleted place at object index"+i);
					return true;
				}
			}
			return false;
		}
			
	}
		
	}