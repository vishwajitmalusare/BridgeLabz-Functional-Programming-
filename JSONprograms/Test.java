package com.jsonprograms;

public class Test {

	public static void main(String[] args) {
Employee emp=new Employee();
emp.setName("VisH");
emp.setEmpNo(101);
emp.setSalary(200000);
String jsonEmployee= Util.javaToJson(emp);

System.out.println("--------------------------------------------------\nJava to JSON object serialization");
System.out.println(jsonEmployee);

Employee emp1=Util.jsonToJava(jsonEmployee, Employee.class);
System.out.println("---------------------------------------------------\nJSON to java object serialization");
	System.out.println(emp1.getName()+" "+emp1.getEmpNo()+"  "+emp1.getSalary());
	}

}
