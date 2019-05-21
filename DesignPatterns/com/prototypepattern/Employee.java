package com.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	private List<String> empList;
	public Employee(){
		empList= new ArrayList<String>();
	}
	public Employee(List<String> list) {
		this.empList=list;
	}
	public void loadData() {
		empList.add("Akshay");
		empList.add("Vish");
		empList.add("samadhan");
		empList.add("Raviraj");
		empList.add("Pooja");
		empList.add("sunil");
		empList.add("Avani");
		empList.add("Pranali");
	}
	public List<String> getEmpList(){
		return empList;
	}
	public Object clone() throws CloneNotSupportedException {
		List<String> temp=new ArrayList<String>();
		for(String s: this.getEmpList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}
}
