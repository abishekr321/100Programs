package zoho;

import java.util.Scanner;

public class Zgs42 {
	public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int arr1[] = new int[n];
	for(int i =0;i<n;i++) { 
		System.out.printf("enter the %d number\n",i+1);
		arr1[i]=input.nextInt();
		}
	for(int i =0;i<n;i++) {
		int count =0;
		for(int j =0;j<n;j++) {
			if(arr1[i]==arr1[j] ){
				count++;
			}
			
		} 
		System.out.println(arr1[i]+" "+count);
		
		
	}

}
}