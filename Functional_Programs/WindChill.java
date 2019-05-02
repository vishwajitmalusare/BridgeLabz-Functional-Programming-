package Functional_program;

public class WindChill {

	public static void main(String[] args) {
		double t= Integer.parseInt(args[0]);
		double v =Integer.parseInt(args[1]);
		
		if(t<=50 && (v<=120&&v>3)) {
		
			double windchill=35.74 + 0.62151* t + ((0.4275*t)+35.75) * (Math.pow(v,0.16));
	System.out.println("Windchill is = "+windchill);
		}
		else {
			System.out.println("Enter t in betwen1-50 or v in between 3-120");
		}
		}

}
