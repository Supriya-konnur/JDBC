package com.xworkz.matrimony.dto;

public class BrideDTO {
	private int id;
	private String name;
	private int age;
	private double height;
	private double weight;
	private String qualification;
	private String expectation;
	private String phoneNumber;
	private double salary;
	private String address;
	private String ocupation;
	
	
	public BrideDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public BrideDTO(int id, String name, int age, double height, double weight, String qualification,
			String expectation, String phoneNumber, double salary, String address, String ocupation) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.qualification = qualification;
		this.expectation = expectation;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.address = address;
		this.ocupation = ocupation;
	}


	@Override
	public String toString() {
		return "BrideDTO [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", qualification=" + qualification + ", expectation=" + expectation + ", phoneNumber=" + phoneNumber
				+ ", salary=" + salary + ", address=" + address + ", ocupation=" + ocupation + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getExpectation() {
		return expectation;
	}


	public void setExpectation(String expectation) {
		this.expectation = expectation;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getOcupation() {
		return ocupation;
	}


	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	
	
	
	

}
