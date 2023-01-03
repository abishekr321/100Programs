package zoho;

import java.util.Arrays;

public class Zgs93 {
	static String S1="";
	static  char sort(char[] arr,int n) {
	if(n==1) {
	return' ';}
	int i=0;
	for( i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				char temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		}
	S1=S1+arr[i];
	return sort(arr,n-1);
}
public static void main(String[] args) {
	String S = "fgadceb";
	char[] arr=S.toCharArray();
	sort(arr,arr.length);
	System.out.println(S1+arr[0]);
}

}


