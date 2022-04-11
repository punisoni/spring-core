package com.collection;
import java.util.*;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class Employee
{
	private int empId;
	private List<String>hobbies;
	private Set<String> contacts;
	private Map<String,Double> mobile;
	 
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
		System.out.println("Hobbies setter method");
	}
	public Set<String> getContacts() {
		return contacts;
	}
	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}
	public Map<String, Double> getMobile() {
		return mobile;
	}
	public void setMobile(Map<String, Double> mobile) {
		this.mobile = mobile;
	}
	public Employee(int empId, List<String> hobbies, Set<String> contacts, Map<String, Double> mobile) {
		super();
		this.empId = empId;
		this.hobbies = hobbies;
		this.contacts = contacts;
		this.mobile = mobile;
		
	}
	public Employee(Address address) {
		super();
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", hobbies=" + hobbies + ", contacts=" + contacts + ", mobile=" + mobile
				+ "]";
	}
	
	
}