package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Namepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter row size : ");
		        int n = sc.nextInt();

		        System.out.println("\nPattern MONA - Output:\n");

		        for (int i = 0; i < n; i++) {
		            // M
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2)) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   "); // spacing between letters

		            // O
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // N
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || i == j) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // A
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n / 2 || j == 0 || j == n - 1) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.println();
		        }

		        sc.close();
		   

	}

}
