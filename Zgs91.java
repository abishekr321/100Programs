package zoho;

import java.util.Arrays;

public class Zgs91 {
	public static void main(String[] args) {
		String S = "fgadceb";
		String S2="";
		char[] arr=S.toCharArray();
		for(int i =0;i<arr.length;i++) {
			for(int j =i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				
			}S2=S2+arr[i];
			
		}System.out.println(S2);
		
	}

}
