package zoho;

import java.util.Scanner;

public class Zgs02 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	String C = input.next();
	int c = C.charAt(0);
	for(int i= c;i<=90;i++) {
		System.out.print((char)i);
	}
	input.close();

}

}
