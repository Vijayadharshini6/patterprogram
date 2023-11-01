package zohopattern;

import java.util.Scanner;

public class patcenhide12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a number: ");
	       int num=sc.nextInt();
	     //  int doub=num*2;
	       for(int i=0;i<num;i++)
	       {
	    	   for(int j=0;j<num;j++)
	           {
	    		   
	    		   if((j==0||i==0)||(i==num-1||j==num-1)) 
	    		   {
	        	   System.out.print("*");
	    		   }
	    		   else {
	    			   System.out.print(" ");
	    		   }
	           }
	    	   System.out.println();
	       }
	}

}
