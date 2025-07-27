package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern31 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }
		            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
		                System.out.print(ch + " ");
		            }
		            for (char ch = 'B'; ch <= (char) ('A' + i - 1); ch++) {
		                System.out.print(ch + " ");
		            }
		            System.out.println();
		        }

		        sc.close();
		    }


}
