package Functional_program;

//import java.util.Scanner;

public class Distance {
//private static Scanner scan;

	public static void main(String[] args) {
//scan=new Scanner(System.in);
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
int a=x,b=y;
double res=Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));

System.out.println("Distance= "+res );
	}

}
