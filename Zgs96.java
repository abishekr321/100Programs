package zoho;

import java.util.Scanner;

public class Zgs96 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S=input.next();
		char s=input.next().charAt(0);
		input.close();
		int i =0;
		for( i =0;i<S.length();i++) {
			if(s==S.charAt(i)) {
				System.out.println("the given letter is present ");
				break;
			}
			
		}
		if(i==S.length()) {
			System.out.println("the given letter is not present");
		}
		
	}

}