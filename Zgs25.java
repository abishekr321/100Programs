package zoho;

import java.util.Scanner;

public class Zgs25 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = input.nextInt();
	System.out.println("Enter the divisor");
	int d = input.nextInt();
	System.out.printf("Quotient is %d \rRemainder is %d",n/d,n%d);
	
	
	}	

}
