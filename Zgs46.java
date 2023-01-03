package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Zgs46 {public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	/*int arr1[] = new int[n];
	for(int i =0;i<n;i++) { 
		System.out.printf("enter the %d number\n",i+1);
		arr1[i]=input.nextInt();}
	*/
	int arr1[] = {1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(arr1));
	System.out.println("No.of shifts to right");
	int r = input.nextInt();
	for(int i =0;i<r;i++) {
		for( int j =n-1;j>0;j--) {
			int temp =arr1[j];
			arr1[j]=arr1[j-1];
			arr1[j-1]=temp;
			}
		}
	System.out.println(Arrays.toString(arr1));
	
	}


}

