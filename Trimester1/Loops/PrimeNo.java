import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // int div = 1, fac = 0;

        // while (div <= N){
        //     if (N % div == 0){
        //         fac ++;
        //     }
        //     div ++; 
        // }

        // if (fac == 2){
        //     System.out.println("Prime");
        // } else {
        //     System.out.println("Not Prime");
        // }       


        // double div = 2, fac = 0;
        // if (N >= 2){
        //     double M = Math.sqrt(N);
        //     while (div <= M){
        //         if (N % div == 0){ 
        //             fac ++; 
        //         }
        //         div ++;
        //     }
    
        //     if (fac == 0){
        //         System.out.println("Prime");
        //     } else {
        //         System.out.println("Not Prime");
        //     }
        // } else {
        //     System.out.println("Not Prime");
        // }
        
        int div = 1, fac = 0;

        while (div*div<=N){
            if (N%div == 0){
                fac ++;
            } 
            div ++;
        }
        
        if (fac >1 || N==0){
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }   

        sc.close();
    }
}