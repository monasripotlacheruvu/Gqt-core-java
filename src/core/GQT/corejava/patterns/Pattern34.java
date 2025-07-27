package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {

		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print("*");

		 
		                if (j != i) {
		                    System.out.print("   ");
		                }
		            }

		            System.out.println();
		        }

		        sc.close();

	}

}
