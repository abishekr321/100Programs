package zoho;

public class Zgs82 {
	public static void main(String[] args) {

	int [][]arr1= {{1,4,2},
	               {7,8,6},
	               {9,8,1}};

for(int i =0;i<arr1.length;i++) {
	for(int j=0;j<arr1[0].length;j++){
			if(j<=i) {
			       System.out.print(arr1[i][j]+" ");}
			else {
				System.out.print("0 ");
				
	}
}System.out.println();
}
}
}
