package zoho;

import java.util.Scanner;

public class Zgs51 {
	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);
	int N = input.nextInt();
   int n =0;
	while(N!=0) {
		int t = N%10;
		n =(n*10)+t;
		N = N/10;
	}
	System.out.println(n);

}
}
