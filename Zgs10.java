package zoho;

import java.util.ArrayList;
import java.util.Scanner;

public class Zgs10 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
int n = input.nextInt();
int []arr=new int[n]	;	
ArrayList<Integer> arr3 = new ArrayList<Integer>();
for(int i =0;i<n;i++) {
	arr[i]=input.nextInt();
	}
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
if(n%2==0) {
	for(int i=0;i<n/2;i++) {
		arr3.add(arr[i]);
		arr3.add(arr[n-i-1]);
		
	}
}
if(n%2!=0) {
	for(int i=0;i<n/2;i++) {
		arr3.add(arr[i]);
		arr3.add(arr[n-i-1]);
		}
	    arr3.add(arr[n/2]);
}



System.out.println(arr3);
input.close();

}


}



