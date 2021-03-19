package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class DeleteBrideApplication {
	public static void main(String[] args) {
		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		BrideDTO brideDTO= new BrideDTO();
		brideDTO.setId(8);
		
		
		int result=matrimonyService.ValidateAndDeleteById(8);
		if(result==1) {
			System.out.println("Bride deleted successfully");
	}else {
		System.out.println("failed to delete");
	}
	}

}
