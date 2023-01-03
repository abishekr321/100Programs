package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Zgs69 {
	static int rotation(int arr[],int n) {
		if(n==0) {
			return 0;
		}
		for(int j=arr.length-1;j>0;j--) {
			int temp= arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
			}
		return rotation(arr,n-1);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Enter the no.of rotation");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		rotation(arr,n);
		System.out.println(Arrays.toString(arr));

	}

}
