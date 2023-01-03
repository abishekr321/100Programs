package zoho;

public class Zgs74 {
	public static void main(String[] args) {
		int [][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]arr2= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr3=new int[arr1.length][arr2[0].length];
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			arr3[i][j]=0;
			for(int k=0;k<arr2[0].length;k++) {
				 arr3[i][j]+=arr1[i][k]*arr2[k][j];
			}
			System.out.print(arr3[i][j]+" ");
			
			
		}System.out.println();
	}
	
	}	
}
