package com.xworkz.interview;

import com.xworkz.interview.dao.InterviewDAOImplementation;
import com.xworkz.interview.dto.InterviewDTO;

public class InterviewDriver {
	public static void main(String[] args) {
		InterviewDTO dto1=new InterviewDTO(123, 2,3, "x-workz", 1, "Shwetha");
		InterviewDTO dto2=new InterviewDTO(123, 2,3, "x-workz", 1, "Shwetha");
		InterviewDTO dto3=new InterviewDTO(123, 2,3, "x-workz", 1, "Shwetha");
		
        InterviewDAOImplementation dao=new InterviewDAOImplementation();
        dao.save(dto1);
        dao.save(dto2);
        dao.save(dto3);
        dao.save(null);
        
        InterviewDTO dto4=new InterviewDTO(123, 2,3, "x-workz",1, "Shwetha");
        dao.save(dto4);
        dao.findDuplicate(dto2);
        dao.update1(dto4);
        dao.delete1(dto3);
        
       
	}
		
}
