package com.xworkz.matrimony;

import java.util.ArrayList; 
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class ManipulateBrideApplication {

	public static void main(String[] args) {

		BrideDTO bride = new BrideDTO();
		
		
		bride.setId(20);
		bride.setName("Neha");
		bride.setAge(22);
		bride.setHeight(5.3);
		bride.setWeight(40);
		bride.setQualification("B.E");
		bride.setExpectation("6 feet height");
		bride.setPhoneNumber("725992981");
		bride.setSalary(500000);
		bride.setOcupation("Engineer");
		bride.setAddress("Mandya");
		
		
		BrideDTO bride2 = new BrideDTO();
		bride2.setId(21);
		bride2.setName("Navya");
		bride2.setAge(23);
		bride2.setHeight(40);
		bride2.setWeight(4.5);
		bride2.setQualification("B.E");
		bride2.setExpectation("no current existing loan");
		bride2.setPhoneNumber("725992981");
		bride2.setSalary(2000000);
		bride2.setOcupation("to be good");
		bride2.setAddress("Gadag");
		
		MatrimonyDAO matrimonyDAO=new MatrimonyDAOImpl();
		MatrimonyService matrimonyService=new MatrimonyServiceImpl(matrimonyDAO);
		
		
		List<BrideDTO> brides=new ArrayList<BrideDTO>();
		brides.add(bride);
		brides.add(bride2);
		
		// for prepare Statement
		int[] result=matrimonyService.validateAndInsertBrides(brides);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

		
		
		// for Statement
		
//		int[] result = matrimonyService.validateAndInsertBrides(brides);
//		for (int i = 0; i < result.length; i++) {
//			if(result[i]==0) {
//				//System.out.println(i+"the bride failed to create");//only for id
//				System.out.println(brides.get(i).getName()+" bride failed to create");
//			}
//			else {
//				System.out.println(brides.get(i).getName()+" bride succeded  to create");
//			}
//		}
		
	}

}
