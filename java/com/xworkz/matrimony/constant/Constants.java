package com.xworkz.matrimony.constant;

public class Constants {
	public static final String DB_URL = "jdbc:mysql://localhost:3306";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	public static final String INSERT_QUERY = "insert into matrimony.bride values(%s,'%s',%s,%s,%s,'%s','%s','%s',%s,'%s','%s')";
	public static final String UPDATE_QUARY = "update matrimony.bride set Qualification=?, salary=? where id=?";
	public static final String DELETE_QUERY = "delete from matrimony.bride where id=?";
	
	
	//for groom
	public static final String INSERT_QUERY1 = "insert into matrimony.groom values(%s,'%s',%s,%s,%s,'%s','%s','%s',%s,'%s','%s')";
	public static final String UPDATE_QUARY1 = "update matrimony.groom set Qualification=?, salary=? where id=?";
	public static final String DELETE_QUERY1 = "delete from matrimony.groom where id=?";
	
}
