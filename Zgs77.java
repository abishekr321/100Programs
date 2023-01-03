package zoho;

import java.util.Arrays;

public class Zgs77 {
	static int sort(int[] arr,int n) {
		if(n==arr.length) {
			return 0;
		}
		for(int i =0;i<arr.length;i++) {
			if(arr[n]<arr[i]) {
				int temp =arr[n];
				arr[n]=arr[i];
				arr[i]=temp;
			}
		}return sort(arr,n+1);
	}
	public static void main(String[]args) {
	 int arr[]= {2,5,8,1,3,9,4,13,7,6,11,12,15,10,14};
	 sort(arr,0);
	 System.out.println(Arrays.toString(arr));
	}
}
