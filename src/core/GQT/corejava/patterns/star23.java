package core.GQT.corejava.patterns;

import java.util.Scanner;

public class star23 {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		       
		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();

		     
		        for (int i = 1; i <= n; i++) {
		            int num = 1; 

		         for (int j = 1; j <= i; j++) {
		                System.out.print(num + " ");

		  
		              num = (num ==1)? 0 : 1;
		            }
		            System.out.println(); 
		        }

		        sc.close();
		    }

}


