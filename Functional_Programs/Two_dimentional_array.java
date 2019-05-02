package Functional_program;

import java.util.Scanner;
import java.io.PrintWriter;

public class Two_dimentional_array{
private static Scanner sc;
public static PrintWriter pw;
	public static void main(String[] args) {
		
int i,j;
sc=new Scanner(System.in);
System.out.println("enter the row and column ");
int row=sc.nextInt();
int col=sc.nextInt();

Object array[][]=new Object[row][col];
PrintWriter pw= new PrintWriter(System.out);

//Inserting elements
System.out.println("Enter the elements :");

for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
	 array[i][j]=sc.nextLine();	
}
}

//Printing elements
System.out.println("Elements in Array are ");

for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		pw.print(array[i][j]+" ");
	 pw.flush();
}	System.out.println();

}
	}

}
