package zoho;

import java.util.Arrays;

public class Zgs90 {
	public static void main(String[] args) {
		String [] arr= {"apple","cat","elephant","ball","dog"};
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(arr[i].charAt(0)<arr[j].charAt(0)) {
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}System.out.println(Arrays.toString(arr));
	}

}
