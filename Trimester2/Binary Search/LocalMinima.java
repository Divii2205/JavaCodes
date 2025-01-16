// Given an array, find index of any local minima in the array (all elements are distinct)
// local minima: an element which is less than all available neighbours.

// package Binary Search;

import java.util.Scanner;

public class LocalMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        System.out.println(check(a, n));
    }
    
    static int check(int[] a, int n){
        int s = 0;
        int e = n-1;

        while(s<=e){
       
        }
        return 0;
    }
}
