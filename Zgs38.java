package zoho;

import java.util.Scanner;

public class Zgs38 {
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr1[] = new int[n];
		for(int i =0;i<n;i++) { 
			System.out.printf("enter the %d number\n",i);
			arr1[i]=input.nextInt();
			}
		int temp =0;
		for(int i =0;i<n;i++) { 
			if(arr1[i]>temp) {
				temp =arr1[i];
				
			}
		}
		System.out.println("the largest number "+temp);
			
		}

}
