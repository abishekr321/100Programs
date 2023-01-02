package zoho;
import java.util.Scanner;

public class Zgs01 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int N = input.nextInt();
	for(int i =1;i<=20;i++) {
		System.out.println(i +" X "+N+" = " +N*i);
		}
	for(int i =1;i<=20;i++) {
		System.out.println(i +" - "+N+" = " +(i-N));
		}

}	

}
