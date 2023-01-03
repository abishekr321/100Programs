package zoho;


import java.util.Scanner;

class Zgs97 {
	   static void sort(char arr[]) {
		   int n= arr.length;
		   for(int i =0;i<n;i++) {
		   for(int j =0;j<n;j++) {
			   if(arr[i]<arr[j]) {
				   char temp =arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	    	
	    }
	   }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char arr[]=input.next().toCharArray();
		int n = arr.length;
		sort(arr);
		char s=input.next().charAt(0);
	     input.close();
	     int max= n-1;
	     int  min = 0;
	     while(min<=max) {
	     int avg = (max+min)/2;
	     if(s==arr[avg]) {
	    	 System.out.println("the given letter is present");
	    	 break;
	    	 
	     }
	     else if(s>arr[avg]) {
	    	  min = avg+1;
	    	 
	     }
	     else {
	    	 max=avg-1;
	    	 
	     }
	     if(min>max) {
	    	 System.out.println("the given letter is not present");
	     }
	     }
	     
	}

}
