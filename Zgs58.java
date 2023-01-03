package zoho;

import java.util.Scanner;

public class Zgs58 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		

		for(int i=n;i>=1;i--) {            
			for(int j=1;j<=i;j++) {          
				System.out.print("*");        
		                                      
			}  
			for(int j=i+1;j<=n;j++) {
				System.out.print("_");
			}
			 for(int j =n-1;j>=i;j--) {
				  System.out.print("_");
				                                    
			  }                                     
			  for(int k=1;k<=i;k++) {               
				  System.out.print("*");            
			  }                
			System.out.println();
			}
		       for(int i=2;i<=n;i++) {            
				for(int j=1;j<=i;j++) {          
					System.out.print("*");        
			                                      
				}  
				for(int j=i+1;j<=n;j++) {
					System.out.print("_");
				}
				 for(int j =n-1;j>=i;j--) {
					  System.out.print("_");
					                                    
				  }                                     
				  for(int k=1;k<=i;k++) {               
					  System.out.print("*");            
				  }                
				System.out.println();}
		 
	
		
	}
	

}
