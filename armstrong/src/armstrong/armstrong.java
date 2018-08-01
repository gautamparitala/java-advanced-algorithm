package armstrong;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number = new Scanner(System.in);
		 int temp = number.nextInt();
	     int n  ;
	     n = temp;
		 int  c=0 ;
	        while( temp>0) {
	        	
	        	int a = temp%10;
	        	temp = temp/10;
	        	c = c + (a*a*a);
	        	}
	       if (c == n) 
	    	   System.out.println("the number is armstrong number");
	       else 
	    		System.out.println("this is not  armstrong number ");
		 

	}

}
