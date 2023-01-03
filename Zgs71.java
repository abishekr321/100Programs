package zoho;

public class Zgs71 {
	public static void main(String[] args) {
	int arr[]= {3,6,9,1,4,7,2,8,5};
	int n =arr.length;
	int firstSmall=arr[0];
	for(int i =0;i<n;i++) {
		if(arr[i]<firstSmall) {
			firstSmall=arr[i];
		}
	}
	int small =arr[0];
	for(int i =0;i<n;i++) {
		if(arr[i]<small&&arr[i]!=firstSmall) {
			small=arr[i];
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
	System.out.println(" second smallest "+arr[1]);
	System.out.println(" second smallest "+small);
}

}
