package zoho;

import java.util.Arrays;

public class Zgs92 {
	static String sort(String[] arr,int n) {
		if(n==1) {
		return"" ;}
		for(int i=0;i<n-1;i++) {
				if(arr[i].charAt(0)>arr[i+1].charAt(0)) {
					String temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
		return sort(arr,n-1);
	}
	public static void main(String[] args) {
	String [] arr= {"apple","cat","elephant","ball","dog"};
	
	sort(arr,arr.length);
	System.out.println(Arrays.toString(arr));
}


}
