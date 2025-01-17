// check if there exists a subarray with sum divisible by k
import java.util.HashSet;
import java.util.Scanner;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(sumK(a, n, k));
    }

    static boolean sumK(int[] a, int n, int k){
        HashSet<Integer> set = new HashSet<>();



        return false;
    }
}
