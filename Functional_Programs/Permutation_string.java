package Functional_program;
import java.util.Scanner;

public class Permutation_string {
static Scanner sc;

	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
//function calling---------------------------------
		permute(str.toCharArray(),0);
}

	
	
	//permutation function ----------------------
	public static void permute(char ch[],int current) {
		
		if(current == ch.length-1) {
			System.out.println(ch);
		}
		else {
			//compare the stings by converting into the character...
			for(int i=current;i<ch.length;i++) {
				swap(ch,current,i);
				permute(ch,current+1);
				swap(ch,current,i);
			}
		}}
		
	//swapping function
		public static void swap(char[] ch1,int i,int j) 
		{
			char temp=ch1[i];
			ch1[i]=ch1[j];
			ch1[j]=temp;
		}
	}

