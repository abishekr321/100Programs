package zoho;

public class Zgs85 {
	public static void main(String[] args) {
	int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i =0;i<arr.length;i++) {
		int rowSum =0;
		int coloumnSum=0;
     for(int k =0;k<arr[i].length;k++) {
				rowSum +=arr[i][k];
				coloumnSum+=arr[k][i];
			}
	System.out.printf("sum of elements in row %d is %d\nsum of elements in coloumn %d is %d\n",i+1,rowSum,i+1,coloumnSum);
}

}
}