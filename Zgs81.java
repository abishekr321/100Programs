package zoho;

public class Zgs81 {
	public static void main(String[] args) {
		int [][]arr1= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]arr2= {{1,2,3},{4,5,6},{7,8,9}};
		int count =0;
		int total =arr1.length*arr1[0].length;
		if(arr1.length==arr2.length&&arr1[0].length==arr2[0].length) {
			for(int i =0;i<arr1.length;i++) {
				for(int j =0;j<arr1[i].length;j++) {
					if(arr1[i][j]==arr2[i][j]) {
						count++;
					}
				}
			}
			if(count==total) {
				System.out.println("the two matrices are equal");
			}
			else {
				System.out.println("not equal");
			}
		}
		else {
			System.out.println("the two matices are not equal");
		}
	}

}
