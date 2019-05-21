package com.prototypepattern;

import java.util.List;

import com.prototypepattern.Employee;
public class PrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee empObject= new Employee();
		empObject.loadData();
		Employee empNewObj =(Employee)empObject.clone();
		Employee empNewObj2 =(Employee)empObject.clone();
		List<String> list = empNewObj.getEmpList();
		list.add("Sneha");
		List<String> list2=empNewObj2.getEmpList();
		list2.remove("Vish");
		System.out.println("emp list : "+empObject.getEmpList());
		System.out.println("empNew list : "+list);
		System.out.println("empNew2 list : "+list2);
	}

}
