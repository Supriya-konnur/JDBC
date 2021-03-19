package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class CreateGroomapplication {

	public static void main(String[] args) {

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService =new MatrimonyServiceImpl(matrimonyDAO);

		GroomDTO groom = new GroomDTO();
		groom.setId(3);
		groom.setName("Prakash");
		groom.setAge(23);
		groom.setHeight(5.9);
		groom.setWeight(60);
		groom.setQualification("BSC");
		groom.setExpectation("kind hearted");
		groom.setPhoneNumber("1234567890");
		groom.setSalary(25000000);
		groom.setOcupation("Engineer");
		groom.setAddres("Banglore");
		
		int result = matrimonyService.ValidateAndCreateGroom(groom);
		 if(result==1) {
			 System.out.println("Groom create successfully");
		 }
		 else {
			 System.out.println("failed to create Groom");
		 }
	}

}
