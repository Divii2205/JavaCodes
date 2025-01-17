package SetsAndMaps;
//  Given an array and a target K. Check if there exists a pair of elements such that A[i] + A[j] = K


import java.util.*;

public class PairSumtoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int k = sc.nextInt(); 
        
        System.out.println(check(a, n, k));
    }

    static boolean check(int[] a, int n, int k){
        HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < n; i++) set.add(a[i]);

        for (int i = 0; i < n; i++){
            int pair = k - a[i];
            if (set.contains(pair)) return true;
            else set.add(a[i]);
        }
        return false;
    }
}
