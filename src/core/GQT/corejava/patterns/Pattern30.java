package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }
		            char ch = (char) ('A' + (2 * i - 2));
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print(ch + " ");
		                ch--;
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		}


