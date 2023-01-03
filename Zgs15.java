package zoho;

import java.util.Scanner;

public class Zgs15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the radius of cylinder");
		double r =input.nextDouble();
		System.out.println("enter the height of cylinder");
		double h =input.nextDouble();
		System.out.printf("the area of the rectangle is %f",(2*3.14*r*h)+(2*3.14*r*r));
	
}


}
