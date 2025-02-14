// Quick sort is faster then merge sort due to space complexity of O(1)
// Collections.sort uses merge sort and not quick sort even if it is the fastest sorting algorithm,
// because COllections.sort is used to sort ArrayLists that is used to play with real world data. 
// and in real world data, parts of an array will be already sorted making merge sort the better option for such cases
// hence Collections.sort is much faster than merge sort while working with real world data

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        sort(a, 0, n-1);

        for(int i = 0; i<n; i++) System.out.print(a[i] + " ");
    }

    static void sort(int[] A, int s, int e){
        if(s>=e) return;
        int p = partition(A,s,e);
        sort(A, s, p-1);
        sort(A, p+1, e);
    }

    static int partition(int[] A, int l, int r){
        int s = l+1, e = r;
        while(s<=e){
            if(A[s]<=A[l]) s++;
            else if (A[e]>A[l]) e--;
            else{
                swap(A, s, e);
                s++;
                e--;
            }
        }
        swap(A, l, e);
        return e;
    }

    static void swap(int[] A, int s, int e){
        int temp = A[s];
        A[s] = A[e];
        A[e] = temp;
    }
}

// Quick sort
// Merge sort
// Count sort => linear sort but useful only when the range of the data is known
// Insertion sort
// Bubble sort
// Selection sort
// Tim sort