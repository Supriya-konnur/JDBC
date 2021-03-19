package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class CreateBrideApplication {

	public static void main(String[] args) {
		
		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService =new MatrimonyServiceImpl(matrimonyDAO);

		BrideDTO bride = new BrideDTO();
		bride.setId(9);
		bride.setName("Naheeda");
		bride.setAge(23);
		bride.setHeight(40);
		bride.setWeight(4.9);
		bride.setQualification("BSC agree");
		bride.setExpectation("must be bussiness man");
		bride.setPhoneNumber("725992981");
		bride.setSalary(2500000);
		bride.setOcupation("agricultur");
		bride.setAddress("Jamkhandi");
		
		int result = matrimonyService.ValidateAndCreateBride(bride);
		 if(result==1) {
			 System.out.println("Bride create successfully");
		 }
		 else {
			 System.out.println("failed to create Bride");
		 }
		
		
	}

}
