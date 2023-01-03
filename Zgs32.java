package zoho;

import java.util.Scanner;

public class Zgs32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x>=0) {
			System.out.println("the number is positive");
		}
		else {
			System.out.println("the number is negative");
		}
		String s =input.next();
		if(s.charAt(0)=='-') {
			System.out.println("the number is negative");
		}
		else {
			System.out.println("the number is positive");
		}
	}
}
