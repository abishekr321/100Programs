package zoho;

public class Zgs62 {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6,7,8,9,0};
		int n = arr1.length;
		System.out.println("odd position elements are");
		for(int i =0;i<n;i++) {
			
			if(i%2==0) {
				System.out.println(arr1[i]);
			}
		}
		System.out.println("even position elements are");
		for(int i =0;i<n;i++) {
			
			if(i%2!=0) {
				System.out.println(arr1[i]);
			}
		}
		System.out.println("odd position elements are");
		for(int i =0;i<n;i=i+2) {
			System.out.println(arr1[i]);
		}
		System.out.println("even position elements are");
		for(int i =1;i<n;i=i+2) {
			System.out.println(arr1[i]);
		}

	}

}
