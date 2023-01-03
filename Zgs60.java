package zoho;

import java.util.Scanner;

public class Zgs60 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String N="";
		for(int i =0;i<n;i++) {
			N=N+"1";
			}
		int m =Integer.valueOf(N);
		int sum=0;
		while(m!=0) {
			sum = sum+m;
			m=m/10;
			
		}
		System.out.println("The sum is :"+sum);
	}

}
