package zoho;

import java.util.Scanner;

public class Zgs05 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		String C = input.next();
		int c = C.charAt(0)-64;
		for(int i =c;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(64+i));
			}System.out.println();
		}
		input.close();

	}

}
