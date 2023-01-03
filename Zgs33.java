package zoho;

import java.util.Scanner;

public class Zgs33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char s = input.next().charAt(0);
        if(s>='A'&&s<='Z'||s>='a'&&s<='z') {
        	System.out.println("the character is an Alphabet");
        }
        else {
        	System.out.println("the character is not an Alphabet");
        }
}
}
