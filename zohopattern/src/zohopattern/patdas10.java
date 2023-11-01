package zohopattern;

import java.util.Scanner;

public class patdas10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int n=sc.nextInt();
	        int firstof=n/2;
	         for(int i=1;i<=firstof;i++)
	       {
	           for(int j=1;j<=firstof-i+1;j++)
	           {
	               System.out.print("*");
	           }
	           for(int k=1;k<=2*i-1;k++)
	           {
	               if(k==2*i-1)
	               {
	                    System.out.print("*");  
	               }
	               else
	               {
	               System.out.print(" ");
	               }
	           }
	           for(int j=1;j<=firstof-i;j++)
	           {
	               System.out.print("*");
	           }
	            System.out.println();
	       }
	         
	          for(int i=firstof;i>=1;i--)
	       {
	           for(int j=1;j<=firstof-i+1;j++)
	           {
	               System.out.print("*");
	           }
	           for(int k=1;k<=2*i-1;k++)
	           {
	                if(k==2*i-1)
	               {
	                    System.out.print("*");  
	               }
	               else
	               {
	               System.out.print(" ");
	               }
	             
	           }
	           for(int j=1;j<=firstof-i;j++)
	           {
	               System.out.print("*");
	           }
	            System.out.println();
	       }
	      
	}

}
