package com.bridgelabz.algorithms;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TepreatureConversion {
public static Scanner sc;
	public static void main(String[] args) {
sc=new Scanner(System.in);

System.out.println("What you want celsious to Fahrenheit OR Fahrenite to celsious ?(0/1)");
int ch=sc.nextInt();

	Utility.tepreatureConversion(ch);
	}
}
