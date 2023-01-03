package zoho;
import java.util.Scanner;
import java.util.Arrays;

public class Zgs52 {
    static String s="";
	static String reverse(String arr[],int a) {
		if(a==0) {
			return " ";
		}
		
		s=arr[a-1]+" ";
		
		return (s+reverse(arr,a-1));
	}
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String s = input.nextLine();
	String[] s1 = s.split(" ");
	int n =s1.length;
	System.out.println(reverse(s1,n));
	
}
}
