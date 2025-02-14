// Merge sort algorithm using recursion

// Time complexity: O(nlogn)
// Space complexity: O(n)

package Recursion;

import java.util.Scanner;

public class RecursiveMergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        mergeSort(a, 0, n-1);
    }

    static void mergeSort(int[] A, int l, int r){
        if(l==r) return;
        int mid = (l+r)/2;
        mergeSort(A, l, mid);
        mergeSort(A, mid+1, r);
        merge(A, l, mid+1, r);
    }

    static void merge(int[] A, int l, int m, int r){
        
    }
}
