package zoho;

import java.util.Scanner;

public class Zgs44 {
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
			for(int j =i;j<n;j++) {
				if(arr1[i]==arr1[j] ){
					count++;
					}
				}
			if(count>1) {
				System.out.println(arr1[i]);
				arr1[i]=0;
			}
			
				
			}
			
			
			
			
		}

	}


