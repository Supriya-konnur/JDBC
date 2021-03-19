package com.xworkz.matrimony;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class DeleteBride_Application {

	public static void main(String[] args) {
		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		
		List<Integer> id = new ArrayList<Integer>();

		id.add(8);
		id.add(9);
		int[] result = matrimonyService.validateAndDeleteIds(id);
		for (int i = 0; i < result.length; i++) {
			if(result[i]==0) {
			
				//System.out.println(i+"the bride failed to create");//only for id
				System.out.println(result[i]+" bride failed to delete");
			}
			else {
				System.out.println(result[i]+" bride succeded  to delete");
			}
			
		}
	}

}
