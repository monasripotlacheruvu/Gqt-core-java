package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		
		            for (int s = 1; s <= n - i - 1; s++) {
		                System.out.print("  "); 
		            }
		            for (int j = i; j >= 0; j--) {
		                System.out.print(j + " ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j + " ");
		            }

		         
		            System.out.println();
		        }

		        sc.close();
		    }

}
