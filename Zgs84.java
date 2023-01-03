package zoho;

public class Zgs84 {
	public static void main(String[]args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		int even=0;
		int odd=0;
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}System.out.println("the frequency of odd numbers is"+odd);
		System.out.println("the frequency of even numbers is"+even);
		
	}

}
