package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern33 {

	public static void main(String[] args) {  
		Scanner sc=new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();
		        for (int i = 1; i <= n; i++) {
		      
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		        sc.close();
	}

}
