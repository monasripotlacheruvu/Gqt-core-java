/**
 * 
 */
package core.GQT.corejava.patterns;
import java.util.Scanner;
/* # # # # #
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 */

/** 
 * @author Monasri
 * @category Patterns
 * @description This pattern is an example for conditional pattern
 */
public class Conditionalpattern37 {

	/**
	 * @param args
	 * This set contains the source code
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the rows:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i==0||i==(n-1)||j==0|| j==(n-1)) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
				
			}
			System.out.println();
		}
		
		

	}

}
