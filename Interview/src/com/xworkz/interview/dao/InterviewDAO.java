package com.xworkz.interview.dao;

import com.xworkz.interview.dto.InterviewDTO;

public abstract class InterviewDAO {
	public abstract boolean save(InterviewDTO dto);
	
	public abstract boolean findDuplicate(InterviewDTO dto);

	public boolean delete1(InterviewDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update1(InterviewDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Update(InterviewDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Update() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Dlete(String CandidateName) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
