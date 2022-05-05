package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String ename;
	private List<String> ephones;
	private Set<String> eaddress;
	private Map<String, String> ecourse;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String ename, List<String> ephones, Set<String> eaddress, Map<String, String> ecourse) {
		super();
		this.ename = ename;
		this.ephones = ephones;
		this.eaddress = eaddress;
		this.ecourse = ecourse;
	}


	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getEphones() {
		return ephones;
	}
	public void setEphones(List<String> ephones) {
		this.ephones = ephones;
	}
	public Set<String> getEaddress() {
		return eaddress;
	}
	public void setEaddress(Set<String> eaddress) {
		this.eaddress = eaddress;
	}
	public Map<String, String> getEcourse() {
		return ecourse;
	}
	public void setEcourse(Map<String, String> ecourse) {
		this.ecourse = ecourse;
	}
	
	

}
