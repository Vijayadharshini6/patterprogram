package zohopattern;

import java.util.Scanner;

public class starddowpat20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n=0;
	         if (sc.hasNextInt()) {
	            n = sc.nextInt();
	        } else {
	            System.out.println("Invalid input for 'n'. Only integers are allowed.");
	            System.exit(0);
	        }
	       // int n=sc.nextInt();	        
	        // n=4;
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=1;j<=n-i;j++)
	            {
	                System.out.print(" ");
	            }                          
	            int count=1;
	                for(int k=1;k<=i;k++)
	            {
	                	
	                System.out.print("*"+" ");
	                count++;
	               
	            }
	              System.out.println();
	              if(count>n)
	                      {
	                          break;
	                      }              
	        }
	}

}
