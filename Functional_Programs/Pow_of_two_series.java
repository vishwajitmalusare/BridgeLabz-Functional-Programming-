package Functional_program;

public class Pow_of_two_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare and accept command line input
		int number=Integer.parseInt(args[0]);
		int i;
		
		//checking the condition and apply function
		if(number>0 && number<=31) {
			
for(i=1;i<=number;i++) {

	int power=(int)Math.pow(2,i);
	System.out.println("2^"+i+" = "+power);	
int len=String.valueOf(power).length();
	//System.out.println("inside"+digit);
	if(len==4) {
		
		if(power%4==0 || power%400==0) {
			System.out.println("Its leap year number : "+power);
		}
	}
}

}
	}
}