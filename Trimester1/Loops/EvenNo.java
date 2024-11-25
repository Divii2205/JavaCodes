// given two numbers between A and B, print all even numbers

import java.util.*;
public class EvenNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        // while (A<=B){
        //     if (A%2 == 0){
        //         System.out.println(A);
        //     }
        //     A += 1;
        // }

        if (A%2 != 0){
            A ++;
        }
        
        while (A<=B){
                System.out.println(A);
                A += 2;
        }

        sc.close();
    }
}
