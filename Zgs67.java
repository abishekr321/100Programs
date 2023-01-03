package zoho;

public class Zgs67 {
	public static void main(String[] args) {
		int arr1[]= {9,8,7,6,5,5,6,7,8,9,1,2,3,4,6,5,2,9,7,1};
		int n =arr1.length;
		int fr[]= new int[n];
		for(int i =0;i<n;i++) {
			if(fr[i]==-1) {
				continue;
			}
			int count =0;
			for(int j =i;j<n;j++) {
				if(arr1[i]==arr1[j] ){
					count++;
					fr[j]=-1;
				}
					
				}if(count>1) {
			     System.out.print(arr1[i]+",");
				}
				
			} 
			
			
		}


}
