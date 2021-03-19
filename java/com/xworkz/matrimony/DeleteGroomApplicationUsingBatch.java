package com.xworkz.matrimony;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class DeleteGroomApplicationUsingBatch {

	public static void main(String[] args) {
		
		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		
		List<Integer> id = new ArrayList<Integer>();

		id.add(4);
		id.add(5);
		int[] result = matrimonyService.validateAndDeleteIdsOfGroom(id);
		for (int i = 0; i < result.length; i++) {
			if(result[i]==0) {
			
				//System.out.println(i+"the bride failed to create");//only for id
				System.out.println(result[i]+" groom failed to delete");
			}
			else {
				System.out.println(result[i]+" groom succeded  to delete");
			}
			
		}
	}

}
