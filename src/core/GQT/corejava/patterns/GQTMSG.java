package core.GQT.corejava.patterns;
import java.util.Scanner;
public class GQTMSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter row size : ");
		        int n = sc.nextInt();

		        System.out.println("\nMessage: THANK YOU GQT\n");

		        for (int i = 0; i < n; i++) {
		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == n / 2) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // H
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || i == n / 2) {
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

		            // K
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i + j == n / 2 || i - j == n / 2) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("     ");

		            // Y
		            for (int j = 0; j < n; j++) {
		                if ((i == j && i < n / 2) || (i + j == n - 1 && i < n / 2) || (j == n / 2 && i >= n / 2)) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // O
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // U
		            for (int j = 0; j < n; j++) {
		                if ((j == 0 || j == n - 1) && i != n - 1 || i == n - 1 && j > 0 && j < n - 1) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("     ");

		            // G
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n - 1 || j == 0 || (i >= n / 2 && j == n - 1) || (i == n / 2 && j >= n / 2)) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // Q
		            for (int j = 0; j < n; j++) {
		                if ((i == 0 || i == n - 2 || j == 0 || j == n - 2) && !(i == n - 1 && j == n - 1)) {
		                    System.out.print("# ");
		                } else if (i == j && i >= n / 2) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.print("   ");

		            // T (again)
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == n / 2) {
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

	