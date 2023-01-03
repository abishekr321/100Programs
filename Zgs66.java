package zoho;
import java.util.Arrays;
import java.util.Scanner;
public class Zgs66 {
public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Enter the no.of rotation");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
        for(int i =1;i<=n;i++) {
        	for(int j=0;j<arr.length-1;j++) {
        		int temp=arr[j];
        		arr[j]=arr[j+1];
        		arr[j+1]=temp;
        	}
        }System.out.println(Arrays.toString(arr));
	}
}


