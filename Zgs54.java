package zoho;

import java.util.ArrayList;
import java.util.Scanner;

public class Zgs54 {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int []arr=new int[n]	;	
	ArrayList<Integer> arr1 = new ArrayList<Integer>();
	ArrayList<Integer> arr2 = new ArrayList<Integer>();
	ArrayList<Integer> arr3 = new ArrayList<Integer>();
	for(int i =0;i<n;i++) {
		arr[i]=input.nextInt();
		if(i%2==0) {
			arr1.add(arr[i]);
		}
		else {
			arr2.add(arr[i]);
		}
		
	}
	for(int i =0;i<arr2.size();i++) {
		for(int j =0;j<arr2.size();j++) {
			if(arr2.get(i)<arr2.get(j)) {
				int temp = arr2.get(i);
				arr2.set(i, arr2.get(j));
				arr2.set(j, temp);
			}
		}
		
	}

	for(int i =0;i<arr1.size();i++) {
		for(int j =0;j<arr1.size();j++) {
			if(arr1.get(i)>arr1.get(j)) {
				int temp = arr1.get(i);
				arr1.set(i, arr1.get(j));
				arr1.set(j, temp);
			}
		}
		
	}
if(arr1.size()<arr2.size()) {
		for(int i =0;i<arr1.size();i++) {
			arr3.add(arr1.get(i));
			arr3.add(arr2.get(i));
		}
		arr3.add(arr2.get(arr2.size()-1));
	}
	if(arr1.size()>arr2.size()) {
		for(int i =0;i<arr2.size();i++) {
			arr3.add(arr1.get(i));
			arr3.add(arr2.get(i));
		}
		arr3.add(arr1.get(arr1.size()-1));}
	System.out.println(arr3);
}


}
