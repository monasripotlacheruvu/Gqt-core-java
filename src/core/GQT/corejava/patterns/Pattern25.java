package core.GQT.corejava.patterns;
import java.util.Scanner;
public class Pattern25 {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int n= sc.nextInt();
		        for (int i = 1; i <= n; i++) {

		        	   for (int m= 1; m<= n - i;m++) {
			                System.out.print(" ");
		            }
                       for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		               
		                
		            }
                     for (int k= i - 1; k>= 1; k--) {
		                System.out.print(k);
		            }
		            System.out.println();
		        }

		        sc.close();

	}

}
