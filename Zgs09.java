package zoho;


import java.util.Arrays;
import java.util.ArrayList;

public class Zgs09 {
	public static void main(String[] args) {
		int [] arr1 = {2,4,5,6,7,9,10,13};
		int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
		int n = arr1.length+arr2.length;
		int[] arr3 = new int[n];
		for(int i =0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i =0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		for(int i =0;i<n;i++) {
			for(int j =i ;j<n;j++) {
				if(arr3[j]<arr3[i]) {
				int temp = arr3[i];
				arr3[i]=arr3[j];
				arr3[j]=temp;
			}
		}

		
		
	}
		System.out.println(Arrays.toString(arr3));
		ArrayList<Integer> arr4=new ArrayList<Integer>();
		for(int i =0;i<n-1;i++) {
			if(arr3[i]!=arr3[i+1]) {
				arr4.add(arr3[i]);
			}
			
		}
		arr4.add(arr3[n-1]);
		System.out.println(arr4);
}
}