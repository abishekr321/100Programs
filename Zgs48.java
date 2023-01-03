package zoho;

import java.util.Scanner;

public class Zgs48 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j =i-1;j>=1;j--) {
				System.out.print(" ");
			}
			for (int j=i;j<n;j++) {
				System.out.print(j);
			}
			for(int j =n;j>=i;j--) {
				System.out.print(j);
			}System.out.println();
		}

	}


}
