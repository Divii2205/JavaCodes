// print the double of the reverse of a number N

import java.util.*;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int mod = 0;
        int count = 0;
        boolean neg = false;

        if (N<0){
            N = N*(-1);
            neg = true;
        }

        while (N>0){
            count = count*10;
            mod = N%10;
            N = N/10;
            count += mod;
        }

        if (neg == true){
            System.out.println(count*(-2));
        } else {
            System.out.println(count*2);
        }
        sc.close();
    }    
}
