package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class DeleteGroomApplication {

	public static void main(String[] args) {

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		GroomDTO groomDTO= new GroomDTO();
		groomDTO.setId(2);
		
		
		int result=matrimonyService.ValidateAndDeleteById(2);
		if(result==1) {
			System.out.println("Groom deleted successfully");
	}else {
		System.out.println("failed to delete");
	}
	}

}
