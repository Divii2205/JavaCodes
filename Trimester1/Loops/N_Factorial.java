import java.util.*;

public class N_Factorial {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long product = 1;

        for (int i = 1; i<=N; i++){
            product *= i;
        }
        
        System.out.println(product);
        sc.close();
    }
}
