package Functional_program;
import java.util.Scanner;

public class Quadratic {
private static Scanner sc;
	public static void main(String[] args) {
		
	//equation is a*x*x+b*x+c
		//Try it in float
		//int ;
		double b=0,c=0,a=0;
		sc=new Scanner(System.in);
	
		System.out.println("Enter the a,b & c ");
		a=sc.nextDouble();
		b=sc.nextInt();
		c=sc.nextInt();
	
	double delta=b*b-4*(a*c);
	double root1_of_x = ((-b)+Math.sqrt(delta))/(2*a);
	double root2_of_x = ((-b)-Math.sqrt(delta))/(2*a);
	System.out.println("Root 1 :"+root1_of_x);
	System.out.println("Root 2 :"+root2_of_x);
	}

}
