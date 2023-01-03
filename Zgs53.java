package zoho;

import java.util.Scanner;

public class Zgs53 {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			String str=input.next();
			int n = str.length();
			int m=0;
			char c=' ';
			for(int i =0;i<n;i++) {
				if(i%2==0) {
					 c =str.charAt(i);
					}
			    else {
			    	m = str.charAt(i)-'0';
					for(int j =1;j<=m;j++) {
					System.out.print(c);
					}
				}
				}
			}
	}
