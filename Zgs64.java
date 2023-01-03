package zoho;

import java.util.Arrays;

public class Zgs64 {
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int arr1[]=arr.clone();
		int arr3[]=  new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			arr3[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
	}
	

}
