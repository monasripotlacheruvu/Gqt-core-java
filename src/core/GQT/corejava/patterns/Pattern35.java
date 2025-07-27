package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern35 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		       
		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();
		        for (int i = 1; i <= n; i++) {
		   
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print(" ");
		            }
		            System.out.print(i);

		            if (i != 1) {
		     
		                for (int space = 1; space <= 2 * (i - 1) - 1; space++) {
		                    System.out.print(" ");
		                }
		                System.out.print(i);
		            }

		            System.out.println();
		        }
		        for (int i = n - 1; i >= 1; i--) {
		     
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print(" ");
		            }
		            System.out.print(i);

		            if (i != 1) {
		        
		                for (int space = 1; space <= 2 * (i - 1) - 1; space++) {
		                    System.out.print(" ");
		                }
		                System.out.print(i);
		            }

		            System.out.println();
		        }

		        sc.close();
	}

}
