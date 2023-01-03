package zoho;

import java.util.Scanner;

public class Zgs06 {

	public static void main(String[] args) {
		System.out.println("enter the total number of students");
		Scanner input = new Scanner(System.in);
		int total = input.nextInt();
		int first =101;
		int last = 120;
		for(int j =1;j<=total/5;j++) {
			System.out.println("group "+j);
		for(int i =first;i<=last;i=i+4) {
			System.out.println(i);
		}
		first++;
		
		}
		input.close();

	}

}

