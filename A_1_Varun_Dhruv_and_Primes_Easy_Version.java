import java.util.Scanner;

public class A_1_Varun_Dhruv_and_Primes_Easy_Version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int k = sc.nextInt();
        int S = sc.nextInt();
        int mn = sc.nextInt();
        int mx = sc.nextInt();

        int count = 0;
        for(int i = L; i<=R; i++){
            if (Perfect(i, S, mn, mx)){
                count ++;
                if (count == k){
                    System.out.println(i);
                    break;
                }
            }
            if (i==R) System.out.println(-1);
        }
    }

    static boolean Perfect(int num, int S, int mn, int mx){
        
        int alt = num;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (alt>0){
            int mod = alt%10;
            max = Math.max(max, mod);
            min = Math.min(min, mod);
            alt/=10;
        }

        if (min != mn || max != mx) return false;
        
        int primeSum = 0;
        int nonPrimeSum = 0;

        alt = num;

        while (alt>0){
            int mod = alt%10;
            if (isPrime(mod)) primeSum += mod;
            else nonPrimeSum += mod;
            alt/=10;
        }

        int diff = Math.abs(primeSum - nonPrimeSum);

        return diff<=S;
    }

    static boolean isPrime(int num){
        return num == 2 || num == 3 || num == 5 || num == 7;
    }
}