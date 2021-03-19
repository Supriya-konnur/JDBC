package com.xworkz.matrimony.dao;

import java.util.List;

import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;

public interface MatrimonyDAO {

	public BrideDTO getById(int id);
	public List<BrideDTO> getAll();
	public int create(BrideDTO bride);
	public int updatePhoneNumberById(String phoneNumber, int id);
	public int deleteById(int id);
	
	public int[] insertBride(List<BrideDTO> brides);
	public int[] updateBrides(List<BrideDTO> brides);
	public int[] deleteIds(List<Integer> ids);
	

	//for groom
	public GroomDTO getById1(int id);
	public List<GroomDTO> getAll1();
	public int create(GroomDTO groom);
	public int updatePhoneNumberById1(String phoneNumber, int id);
	public int deleteById1(int id);
	
	public int[] insertGroom(List<GroomDTO> grooms);
	//public int[] updateGrooms(List<GroomDTO> grooms);
	public int[] updateGrooms(List<GroomDTO> grooms);
	public int[] deleteIdsOfGroom(List<Integer> ids);

	


	
}
