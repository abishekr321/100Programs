package zoho;

import java.util.Scanner;

public class Zgs35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double factorial =1;
		for(int i =1; i<=n;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
}
	}

