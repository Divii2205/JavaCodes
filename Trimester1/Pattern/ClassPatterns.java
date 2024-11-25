import java.util.*;
public class ClassPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Pattern1: upside down right angle triangle
        // for (int i = n; i>0; i--){
        //     for (int j = 1; j<i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("*");
        // }

        // Pattern2: start space row number space star and so on
        // for (int i = 1; i<=n; i++){
        //     for (int j = 1; j <=i; j++){

        //         if (j%2 != 0) {
        //             if (j == i) System.out.println("*");
        //             else System.out.print("* ");
        //         }
        //         else {
        //             if (j == i) System.out.println(j);
        //             else System.out.print(j + " ");  
        //         }              
        //     }
        // }

        // Pattern3: number space start space number+1
        // for (int i = 1; i<=n; i++){
        //     int num = 1;
        //     for (int j = 1; j<=i; j++){

        //         if (j%2 !=0) {
        //             if (j == i) System.out.println(num);
        //             else System.out.print(num + " ");
        //             num++;
        //         } else {
        //             if (j == i) System.out.println("*");
        //             else System.out.print("* ");
        //         }
        //     }
        // }

        // Pattern4: star, n-1 spaces, star
        // for (int i = 1; i<=n; i++){
        //     System.out.print("*");
        //     for (int j = 1; j<n; j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }

        // Pattern5: star, reducing n-1 spaces, star
        // for (int i = n; i>0; i--){
        //     System.out.print("*");
        //     for (int j = 1; j<i; j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }

        // Pattern6: flipped right angled triangle
        // for (int i = 1; i<=n; i++){
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j<=i; j++)
        //         System.out.print("*");

        //     System.out.println();
        // }

        // Pattern7: flipped inverted right angled triangle
        // for (int i = n; i>0; i--){
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j<=i; j++)
        //         System.out.print("*");

        //     System.out.println();
        // }

        // Pattern8: Hollow Diamond
        // for (int i = n; i>0; i--){
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     for (int j = 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // for (int i = 1; i<=n; i++){
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     for (int j = 1; j<=2*(n-i); j++){
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        // Pattern9: star
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }

            for (int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j<(4*n-1)-2*i; j++){
                System.out.print("*");
            }

            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = n; i>0; i--){
            for (int j = 1; j<i; j++){
                System.out.print(" ");
            }

            for (int j = 0; j<=(4*n-1)-2*i+1; j++){
                System.out.print("*");
            }

            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = n; i>0; i--){
            for (int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }

            for (int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        // Trapezium 
        // for (int i = 0; i<n; i++){
        //     for (int j = 0; j<i; j++) System.out.print(" ");

        //     for (int j = 0; j<n-i; j++) System.out.print("*");

        //     for (int j = 0; j<2*n-1; j++) System.out.print("*");

        //     for (int j = 0; j<n-i; j++) System.out.print("*");

        //     System.out.println();
        // }

        sc.close();
    }
}
