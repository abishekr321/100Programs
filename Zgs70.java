package zoho;

public class Zgs70 {
	public static void main(String[] args) {
		int arr[]= {3,6,9,1,4,7,2,8,5};
		int n =arr.length;
		int firstlarge=arr[0];
		for(int i =0;i<n;i++) {
			if(arr[i]>firstlarge) {
				firstlarge=arr[i];
			}
		}
		int large =arr[0];
		for(int i =0;i<n;i++) {
			if(arr[i]>large&&arr[i]!=firstlarge) {
				large=arr[i];
			}
		}
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(" second smallest "+arr[n-2]);
		System.out.println(" second smallest "+large);
	}



}
