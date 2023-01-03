package zoho;

import java.util.Arrays;

public class Zgs41 {
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		int arr2[]=arr1;
		System.out.println(Arrays.toString(arr2));
		int arr3[]=new int[arr1.length];
		for(int i =0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		System.out.println(Arrays.toString(arr3));
		//int arr4[]=new int[arr1.length];
		int arr4[]=arr1.clone();
		System.out.println(Arrays.toString(arr4));
		

}
}
