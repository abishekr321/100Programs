package zoho;

import java.util.Scanner;

public class Zgs49 {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	int m = input.nextInt();
	for (int i =m;i>=1;i--) {
		for(int k=1;k<=m-i;k++) {
			System.out.print(" ");
			
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		
	}

}
}
