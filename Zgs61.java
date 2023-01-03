package zoho;

public class Zgs61 {
	 static int reverse(int arr[],int n) {
		  if(n==0) {
			  return 0;
		  }
		  System.out.print(arr[n-1]+",");
		  return reverse(arr,n-1);
	  }
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8,9};
		int n = arr1.length;
		for(int i =n-1;i>=0;i--) {
			System.out.print(arr1[i]+",");
			
		}
		System.out.println();
		reverse(arr1,n);
		
	}

}
