package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
             System.out.print("Enter number of rows: ");
		        int n = sc.nextInt();
                  for (int i = 1; i <= n; i++) {
		         
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
 }
		            if (i < n) {
		             
		                for (char ch = 'A'; ch < 'A' + i; ch++) {
		                    System.out.print(ch + " ");
		                }

		            
		                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
		                    System.out.print(ch + " ");
		                }

		            } else {
	
		                for (char ch = 'A'; ch <= 'E'; ch++) {
		                    System.out.print(ch + " ");
		                }
		         
		                for (char ch = 'A'; ch <= 'D'; ch++) {
		                    System.out.print(ch + " ");
		                }
		            }

		            System.out.println();
		        }

		        sc.close();
		    }
	
}
