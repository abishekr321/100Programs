package zoho;

import java.util.Scanner;

public class Zgs47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    input.close();
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j =i-1;j>=1;j--) {
				System.out.print(j);
			}System.out.println();
		}

	}

}
