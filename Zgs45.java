package zoho;

import java.util.Scanner;

public class Zgs45 {public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int arr1[] = new int[n];
	int sum =0;
	for(int i =0;i<n;i++) { 
		System.out.printf("enter the %d number\n",i+1);
		arr1[i]=input.nextInt();
		sum = sum+arr1[i];
		}
	System.out.println(sum);

}
}
