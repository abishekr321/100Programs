package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Zgs94 {public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String name1= input.next();
	String name2 = input.next();
	char []cha1 = name1.toCharArray();
	char []cha2 = name2.toCharArray();
	for(int i =0 ; i< cha1.length;i++) {
		for(int j =i;j<cha1.length;j++) {
			if(cha1[i]>cha1[j]) {
				char temp = cha1[i];
				cha1[i]= cha1[j];
				cha1[j]=temp;
			}
			
		}
	}
	for(int i =0 ; i< cha2.length;i++) {
		for(int j =i;j<cha2.length;j++) {
			if(cha2[i]>cha2[j]) {
				char temp = cha2[i];
				cha2[i]= cha2[j];
				cha2[j]=temp;
			}
			
		}
	}
	int count=0;
	for(int i=0;i<cha1.length;i++){
		if(cha1[i]==cha2[i]) {
			count++;
		}
		
	}

	//System.out.println(Arrays.toString(cha1));
	//System.out.println(Arrays.toString(cha2));
	if (count==cha1.length) {
		System.out.println("word is anagram");
	}
   else {System.out.println("word is not a anagram");}
	

	
}
}
