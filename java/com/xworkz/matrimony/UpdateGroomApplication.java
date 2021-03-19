package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class UpdateGroomApplication {

	public static void main(String[] args) {

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService =new MatrimonyServiceImpl(matrimonyDAO);
		
		GroomDTO groomDTO= new GroomDTO();
//		groomDTO.setId(3);
//		groomDTO.setPhoneNumber("9763245679");
		
		int result=matrimonyService.ValidateAndUpdatePhoneNumberById1("9763245679", 3);
		if(result==1) {
			System.out.println("Groom updated successfully");
		}
		else {
			 System.out.println("failed to updated Groom");
		 }
	}

}
