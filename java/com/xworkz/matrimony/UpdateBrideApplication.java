package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class UpdateBrideApplication {

	public static void main(String[] args) {
		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService =new MatrimonyServiceImpl(matrimonyDAO);
		
		BrideDTO brideDTO= new BrideDTO();
		brideDTO.setId(1);
		brideDTO.setPhoneNumber("9763245679");
		
		int result=matrimonyService.ValidateAndUpdatePhoneNumberById("9763245679", 1);
		if(result==1) {
			System.out.println("Bride updated successfully");
		}
		else {
			 System.out.println("failed to updated Bride");
		 }
		

	}

}
