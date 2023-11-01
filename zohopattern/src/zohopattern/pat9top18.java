package zohopattern;

import java.util.Scanner;

public class pat9top18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of rows: ");
       int row=sc.nextInt();
     //  int row=9;
       int col=2*row-1;
       int midrow=row-1;
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               if(j>=midrow-i&&j<=midrow+i)
               {
                   int num=row-Math.abs(midrow-j);
                   System.out.print(num);
               }
               else
               {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
	}

}
