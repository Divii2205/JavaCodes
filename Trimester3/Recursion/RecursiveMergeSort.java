// Merge sort algorithm using recursion

// Time complexity: O(nlogn)
// Space complexity: O(n)

import java.util.Scanner;

public class RecursiveMergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        mergeSort(a, 0, n-1);
        for(int i = 0; i<a.length; i++) System.out.print(a[i] + " ");
    }

    static void mergeSort(int[] A, int l, int r){
        if(l==r) return;
        int mid = (l+r)/2;
        mergeSort(A, l, mid);
        mergeSort(A, mid+1, r);
        merge(A, l, mid+1, r);
    }

    static void merge(int[] a, int l, int m, int r){
        int[] ans = new int[r-l+1];

        int index = 0;

        int s = l;
        int e = m;

        while(s<m && e<=r){
            if(a[s] >= a[e]) ans[index++] = a[e++];
            else ans[index++] = a[s++];
        }

        while(s<m) ans[index++] = a[s++];

        while(e<=r) ans[index++] = a[e++];

        for(int i = 0; i<ans.length; i++){
            a[l++] = ans[i];
        }
    }
}
