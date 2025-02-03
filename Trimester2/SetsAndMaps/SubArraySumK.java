// Given an array check if there exists a subarray with sum = k

import java.util.HashSet;
import java.util.Scanner;

public class SubArraySumK {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(sumK(a, n, k));
    }

    static boolean sumK(int[] a, int n, int k){
        int[] ps = new int[n];
        ps[0] = a[0];

        for(int i  = 1; i<n; i++){
            ps[i] = ps[i-1] + a[i];
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<n; i++) set.add(ps[i]);

        for(int i = 0; i<n; i++){
            int pair = ps[i] - k;
            if(set.contains(pair)) return true;
        }

        return false;
    }
}

// count the number of sub arrays whose sum is k