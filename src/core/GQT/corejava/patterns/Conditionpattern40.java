/**
 * 
 */
package core.GQT.corejava.patterns;

import java.util.Scanner;

/**
 * @author Monasri
 */
public class Conditionpattern40 {

	/**
	 * @param args
	 * @description This contains source code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the rows:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
					System.out.print("- ");
				}
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("$ " );
				}
				
			
			System.out.println();
		}
	}

}
