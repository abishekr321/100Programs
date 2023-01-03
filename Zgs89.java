package zoho;


import java.util.Scanner;
import java.util.ArrayList;

public class Zgs89 {public static void main(String[]args) {
	Scanner input=new Scanner(System.in);
	ArrayList<String> arr=new ArrayList<String>();
	String S=input.nextLine();
	String s="";
	 for(int i =0;i<S.length();i++) {
		 if(S.charAt(i)!=' ') {
			 s=s+S.charAt(i);
			 }
		 else {
			 arr.add(s);
			 s="";
		}
		 
	 }
	  arr.add(s);
	  System.out.println(arr);
	  input.close();


	}

}
