package zoho;

import java.util.Scanner;

public class Zgs07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		input.close();
		int m = M%10;
		for(int i =1;i<=m;i++) {
			for(int j =1;j<=m;j++) {
				if(i==j) {
					System.out.print(i);
					}
				else if(i+j==m+1) {
					 
					 System.out.print(i);
				}
				   
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		}
	}


	



