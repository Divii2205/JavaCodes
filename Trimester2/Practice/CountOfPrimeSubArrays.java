import java.util.Scanner;

public class CountOfPrimeSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int count = 0;

        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += a[j];
                if(prime(sum)) count++;
            }
        }

        System.out.println(count);
    }

    static boolean prime(int n){
        if(n<2) return false;

        for(int i = 2; i*i<=n; i++){
            if(n%i == 0) return false;
        }

        return true;
    }
}
