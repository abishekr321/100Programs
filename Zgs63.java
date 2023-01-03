package zoho;

public class Zgs63 {
	public static void main(String[] args) {
		int arr[]= {3,6,9,1,4,7,2,8,5,0};
		int n =arr.length;
		int largest=0;
		int smallest=arr[0];
		for(int i =0;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}System.out.println("largest "+largest);
		System.out.println("smallest "+smallest);
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}System.out.println("largest "+arr[n-1]);
		System.out.println("smallest "+arr[0]);
	}
	

}
