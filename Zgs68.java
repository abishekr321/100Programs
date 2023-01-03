package zoho;

public class Zgs68 {
	static int sum =0;
	static int total(int arr[],int n) {
		if(n==0) {
			return 0;
		}
		sum = arr[n-1];
		return sum+total(arr,n-1);
	}
	public static void main(String[] args) {
	int arr1[]= {9,8,7,6,5,5,6,7,8,9,1,2,3,4,6,5,2,9,7,1};
	int n =arr1.length;
	int sum =0;
	for(int i =0;i<n;i++) {
		sum=sum+arr1[i];
		}
	System.out.println(sum);
	System.out.println(total(arr1,n));
		
		
	}


}
