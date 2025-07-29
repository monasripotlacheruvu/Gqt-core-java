package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Conditionpatter39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/**
		 * @author Monasri
		 */

		    /**
		     * @param args
		     * This program prints a left-angled triangle using # and -
		     */
		  
		        Scanner sc = new Scanner(System.in);
		        System.out.print("enter the rows: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j <= i; j++) {
		                if (j == 0 || i == n - 1 || j == i) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("- ");
		                }
		            }
		            System.out.println();
		        }

		        sc.close();
		    
	}

}
