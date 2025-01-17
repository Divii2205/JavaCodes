// Given an array. Check if there exists a sub-array whose sum is 0

import java.util.HashSet;
import java.util.Scanner;

public class SubArraySumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(sumZero(a, n));
    }

    static boolean sumZero(int[] a, int n){
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += a[i];
            if(set.contains(sum) || sum == 0) return true;
            else set.add(sum);
        }

        return false;
    }
}

//  Similar Questions:
//  count the number of sub arrays with sum = 0
//  length of the longest subarray with sum = 0