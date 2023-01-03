package zoho;

//import java.util.Scanner;

public class Zgs75 {
public static void main(String[] args) {
	/*Scanner input = new Scanner(System.in);
	System.out.println("enter the starting no.of array");
	int s = input.nextInt();
	System.out.println("enter the ending no.of array");
	int e = input.nextInt();
	input.close();
	int size=((s+e)/2)+1;
	int []arr=new int[size];
	for(int i =0;i<size;i++) {
		if(s!=e+1) {
			arr[i]=s++;
		}
	}*/
	int arr[]= {2,5,8,1,3,9,4,13,7,6,11,12,15,10,14};
	System.out.println("the even numbers are");
	for(int i =0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		}
	}
	System.out.println("the odd numbers are");
	for(int i =0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
	}
	
	
	
}
}
