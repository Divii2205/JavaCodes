// Given an array in which every element appears twice except only one element which appears once. Find the single number.

import java.util.Scanner;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        System.out.println(noDuplicate(a, n));
    }

    static int noDuplicate(int[] a, int n){
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(a[mid] != a[mid-1] && a[mid] != a[mid+1]) return a[mid];
            else if(a[mid] == a[mid-1]) e = mid-2;
            else s = mid+2;
        }
        return 0;
    }
}