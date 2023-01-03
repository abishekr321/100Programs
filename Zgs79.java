package zoho;

public class Zgs79 {
	public static void main(String[] args) {
	int [][]arr1= {{1,0,0},
			       {0,1,0},
			       {0,0,1}};
	int count =0;
	int total=arr1.length*arr1[0].length;
	for(int i =0;i<arr1.length;i++) {
		for(int j=0;j<arr1[0].length;j++){
			if(i==j) {
				if(arr1[i][j]==1) {
				count++;
			}
			}
			else {
			    if(arr1[i][j]==0) {
			    	count++;
			    }
			}
			
			}
				}
	if(count==total) {
		System.out.println("the given matrix is identity matrix");
	}
	else {
		System.out.println("the given matrix is not identity matrix");
	}
}
}


