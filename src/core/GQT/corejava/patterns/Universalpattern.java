package core.GQT.corejava.patterns;

import java.util.Scanner;

public class Universalpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/**
		 * @author Monasri
		 */

		    /**
		     * @param args
		     * This program prints a Universal pattern
		     */
		  
		        Scanner sc = new Scanner(System.in);
		        System.out.print("enter the rows: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j <=n-1; j++) {
		            	
		                if (i == 0 || i == (n - 1 )|| j == 0 || j == (n-1)|| 
		                		i==(n/2)||j==(n/2) ||i==j||i+j==(n-1)
		                		||i+j==(n/2) ||j-i==(n/2) ||i-j==(n/2) 
		                		||i+j==(n-1)+(n/2)) {
	
		                    System.out.print("# ");
		                } 
		                else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.println();
		        }

	}

}