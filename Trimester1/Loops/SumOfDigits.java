import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int mod = 0;

        if (N<0){
            N = N*(-1);
        }

        while (N>0){
            mod += N%10;
            N=N/10;
        }

        System.out.println(mod);
        sc.close();
    }
    
}
