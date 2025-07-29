package core.GQT.corejava.patterns;

import java.util.Scanner;

public class PatternA {

    public static void main(String[] args) {
        /**
         * @author Monasri
         * @description This program prints the pattern 'A' two times, separately
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nPattern A - First Output:\n");

        // First pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == (n - 1) || i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Separator
        System.out.println("\nPattern b - Second Output:\n");

        // Second pattern (optional - remove if not needed)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == (n - 1) || i == (n / 2) ||i==(n-1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    

// Separator
 

System.out.println("\nPattern C - Output:\n");

     for (int i = 0; i < n; i++) {
          for (int j = 0; j <n; j++) {
    if (i == 0 || j == 0 ||i==(n-1)) {
        System.out.print("# ");
    } else {
        System.out.print("  ");
    }
}
System.out.println();
}


  // Separator
   

  System.out.println("\nPattern D - Output:\n");

       for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
      if (i == 0 || j == 0 ||i==(n-1) ||j==(n-1)) {
          System.out.print("# ");
      } else {
          System.out.print("  ");
      }
  }
  System.out.println();
       }
//Separator


System.out.println("\nPattern E - Output:\n");

    for (int i = 0; i < n; i++) {
         for (int j = 0; j <n; j++) {
   if (i == 0 || j == 0 ||i==(n-1) ||i==(n/2)) {
       System.out.print("# ");
   } else {
       System.out.print("  ");
   }
}
System.out.println();
    }
//Separator


System.out.println("\nPattern F - Output:\n");

  for (int i = 0; i < n; i++) {
       for (int j = 0; j <n; j++) {
 if (i == 0 || j == 0  ||i==(n/2)) {
     System.out.print("# ");
 } else {
     System.out.print("  ");
 }
}
System.out.println();
  }
//Separator


System.out.println("\nPattern g - Output:\n");

for (int i = 0; i < n; i++) {
     for (int j = 0; j <n; j++) {
    	 if (i == 0 || i == n - 1 || j == 0 ||
                 (i == n / 2 && j >= n / 2) ||
                 (j == n - 1 && i >= n / 2) ||
                 (i == n - 2 && j == n / 2)) {
                 System.out.print("# ");
             } else {
                 System.out.print("  ");
}
}
System.out.println();

}

//Separator


System.out.println("\nPattern H - Output:\n");

for (int i = 0; i < n; i++) {
     for (int j = 0; j <n; j++) {
if (i == (n/2)|| j == 0  ||j==(n-1)) {
   System.out.print("# ");
} else {
   System.out.print("  ");
}
}
System.out.println();
}


//Separator


System.out.println("\nPattern I - Output:\n");

for (int i = 0; i < n; i++) {
   for (int j = 0; j <n; j++) {
if (i == (n-1)|| i == 0  ||j==(n/2)) {
 System.out.print("# ");
} else {
 System.out.print("  ");
}
}
System.out.println();
}

//Separator


System.out.println("\nPattern J - Output:\n");

for (int i = 0; i < n; i++) {
 for (int j = 0; j <n; j++) {
if ( i == 0  || j == n / 2 ||                       
(i == n - 1 && j < n / 2) ||       
(j == 0 && i > n / 2)  ){
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}


//Separator


System.out.println("\nPattern K - Output:\n");

for (int i = 0; i < n; i++) {
 for (int j = 0; j <n; j++) {
if ( j == 0 ||                    
i + j == n / 2 ||             
i - j == n / 2  ) {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}


//Separator


System.out.println("\nPattern L - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j <n; j++) {
if ( j == 0 || i==(n-1) )                  
 {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}

//Separator


System.out.println("\nPattern M - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j <n; j++) {
if ( j == 0 || j==(n-1)||(i == j && i <= n / 2) ||         
(i + j == n - 1 && i <= n / 2))                  
{
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}


//Separator


System.out.println("\nPattern N - Output:\n");

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (
            j == 0 ||          
            j == n - 1 ||       
            i == j             
        ) {
            System.out.print("# ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}


//Separator


System.out.println("\nPattern 0 - Output:\n");

for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) {
      if ( (
                      i == 0 ||                     
                      i == n - 1 ||                  
                      j == 0 ||                    
                      j == n - 1                     
                  )            
      ) {
          System.out.print("# ");
      } else {
          System.out.print("  ");
      }
  }
  System.out.println();
}

//Separator


System.out.println("\nPattern P - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
    if ( (
    		 j == 0 ||                       
             (i == 0 && j < n - 1) ||         
             (i == n / 2 && j < n - 1) ||     
             (j == n - 1 && i > 0 && i < n / 2)                    
                )            
    ) {
        System.out.print("# ");
    } else {
        System.out.print("  ");
    }
}
System.out.println();
}


//Separator


System.out.println("\nPattern Q - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
  if ( (
		  (i == 0 && j > 0 && j < n - 1) ||      
          (i == n - 2 && j > 0 && j < n - 1) ||    
          (j == 0 && i > 0 && i < n - 2) ||      
          (j == n - 1 && i > 0 && i < n - 2) ||     
          (i - j == 1 && i >= n / 2)                  
              )            
  ) {
      System.out.print("# ");
  } else {
      System.out.print("  ");
  }
}
System.out.println();
}


//Separator


System.out.println("\nPattern R - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if ( 
		                    
            j==n/2||j==0&&j>=n/2||j==(n-1)&&i<=n/2||i==n/2&&j>=n/2||i==j&&j>=n/2&&i>=n/2||i==0&&j>=5          
) {
    System.out.print("# ");
} else {
    System.out.print("  ");
}
}
System.out.println();
}

//Separator
System.out.println("\nPattern S - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if ( (
		i == 0 ||                                 
		i == n / 2 ||                             
		i == n - 1 ||                            
		(j == 0 && i < n / 2) ||                
		(j == n - 1 && i > n / 2)                 
            )            
) {
    System.out.print("# ");
} else {
    System.out.print("  ");
}
}
System.out.println();
}

//Separator
System.out.println("\nPattern T - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if ( 
		 i == 0 ||                   
         j ==( n / 2) )                 {
  System.out.print("# ");
} else {
  System.out.print("  ");
}
}
System.out.println();
}

//Separator
System.out.println("\nPattern U - Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if ( 

        (j == 0 && i != n - 1) ||             
        (j == n - 1 && i != n - 1) ||       
        (i == n - 1 && j > 0 && j < n - 1) )                 {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}


//Separator
System.out.println("\nPattern  V- Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if ( 

		i==j&&j<=n/2||i+j==n-1&&i<=n/2 )              {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}

//Separator
System.out.println("\nPattern  W- Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if ( 

		j==0||i+j==(n-1)&&i>=n/2||i==j&&i>=n/2||j==(n-1)  )              {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}




//Separator
System.out.println("\nPattern  X- Output:\n");

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if 
		(j == i || j == (n - 1 - i))

		            {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}


//Separator
System.out.println("\nPattern  Y- Output:\n");


for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if 
		(j == i &&j<=n/2 || j+i == (n - 1 )&&j>=5||j==n/2&&i>=n/2)

		            {
System.out.print("# ");
} else {
System.out.print("  ");
}
}
System.out.println();
}


//Separator
System.out.println("\nPattern Z - Output:\n");

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
       
        if (i == 0 || i == n - 1 || j == n - 1 - i) {
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















