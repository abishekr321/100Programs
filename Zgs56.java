package zoho;
import java.util.Scanner;
public class Zgs56 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int l=0;
		int m =0;
		int k =1;
	    for(int i =1;i<n;i++) {
	    	if(l==n) {
	    		continue;
	    	}
	    	l=l+i;
	    	m++;
	    	}
		System.out.println(m);
		for(int i =1;i<=m;i++) {
			for(int j =m-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
				
			}System.out.println();
		}
	}

}
