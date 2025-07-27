package core.GQT.corejava.patterns;
import java.util.Scanner;
public class pattern24 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		      
		        System.out.print("Enter number rows: ");
		        int row = sc.nextInt();

		       
		        for (int i = 1; i <= row; i++) {
		           
		            for (int j=row-i;j>0;j--) {
		                System.out.print(" ");
		            }
		

		            
		            for (int k= 1; k<= i * 2 - 1; k++) {
		                System.out.print(i);
		            }

		            
		            System.out.println();
		        }

		        
		        sc.close();
	}

}
