package zoho;

import java.util.Scanner;

public class Zgs34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sum =0;
		for (int i=1;i<=n;i++)
		{
			sum +=i;
		}
		System.out.println(sum);
		int digit =0;
		while(sum!=0) {
			int temp =sum%10;
			if(digit<temp) {
				digit = temp;}
			sum = sum/10;
		}
		System.out.println(digit);

	}
}
