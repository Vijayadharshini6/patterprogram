package zohopattern;

import java.util.Scanner;

public class patstaropp17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub no out
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter a number: ");
	       int row=sc.nextInt();
		//int row=9;
	       int count=9;
	       for(int i=0;i<row;i++)
	        {
	            for(int j=0;j<=i;j++)
	            {
	                System.out.print(" "); 
	            }
	            for(int j=0;j<row-i;j++)
	            {
	                 System.out.print("*"+" ");
	            }
	            count--;
	         System.out.println();   
	        }
	}

}
