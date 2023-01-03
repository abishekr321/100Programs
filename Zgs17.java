package zoho;

import java.util.Scanner;

public class Zgs17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of Outer circle");
		double R =input.nextDouble();
		System.out.println("enter the height of Inner circle");
		double r =input.nextDouble();
		System.out.printf("the area of the rectangle is %f",3.14*(R*R-r*r));
	

	}

}
