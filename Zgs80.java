package zoho;

public class Zgs80 {public static void main(String[] args) {
	int [][]arr1= {{0,4,2},
		          {0,0,6},
		          {0,0,1}};
	int count =0;
	int avg=(arr1.length*arr1[0].length)/2+1;
	for(int i =0;i<arr1.length;i++) {
		for(int j=0;j<arr1[0].length;j++){
				if(arr1[i][j]==0) {
				count++;
			}
			}
	}
	if(count>=avg) {
		System.out.println("the given matrix is sparse matrix");
	}
	else {
		System.out.println("the given matrix is not sparse matrix");
	}

}
}