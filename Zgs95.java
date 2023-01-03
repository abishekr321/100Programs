package zoho;

import java.util.Scanner;

public class Zgs95 {public static void main (String[] args) {
	Scanner n =new Scanner(System.in);
	String word = n.next();
	String word2 = "";
    for (int i=( word.length()-1);i>=0;i--) {
          word2 = word2+ word.charAt(i);
        }
    if (word.contains(word2)) {
    	System.out.println("palindrome");}
    else {
    	System.out.println("not palindrome");
    }
    String bool="";
    for(int i =0;i<word.length();i++) {
    	if(word.charAt(i)==word2.charAt(i)){
    		bool="true";
    		}
    	else {
    		bool="false";
    		break;
    	}
    }
    if(bool=="true") {
    	System.out.println("palindrome");
    }
    else {
    	System.out.println("not palindrome");
    }
    	
    	
}


}
