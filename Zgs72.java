package zoho;
import java.util.ArrayList;

public class Zgs72 {
	public static void main(String[] args) {
			int arr1[]= {9,8,7,6,5,5,6,7,8,9,1,2,3,4,6,5,2,9,7,1};
			ArrayList<Integer>arr2=new ArrayList<Integer>();
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
					arr1[i]=-1;
				}
			}
		for(int i =0;i<n;i++) {
			if(arr1[i]!=-1) {
				arr2.add(arr1[i]);
				
			}
		}
				System.out.println((arr2));
				
			
	}
}
