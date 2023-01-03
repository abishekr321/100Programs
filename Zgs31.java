package zoho;

import java.util.Scanner;

public class Zgs31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a =");
		double a = input.nextDouble();
		System.out.println("b =");
	    double b = input.nextDouble();
		System.out.println("c =");
		double c = input.nextDouble();
		double d = b*b-4*a*c;
		if(d>0) {
			System.out.printf("The roots are real \rroot1 =%.2f\rroot2=%.2f",(-b+Math.sqrt(d))/2*a ,(-b-Math.sqrt(d))/2*a);
		}
		if(d==0) {
			System.out.printf("The roots are real and equal"+(-b/2*a) +"\n"+(-b/2*a));
		}
		if(d<0) {
			d=4*a*c-b*b;
			double real=-b/(2*a);
			double imaginary =(Math.sqrt(d))/(2*a);
			
			System.out.printf("The roots are imaginary \rroot1 =%.2f+%.2f",real,imaginary);
			System.out.printf("\rroot2=%.2f- %.2f",real,imaginary);
		}
	}

}



