//Selection sort -- minElSort

import java.util.*;
public class SelectionSort {

    static void selectMin(int[] A, int S){
        
        for (int i = 0; i<A.length-1; i++){
            int index = i;
            for (int j = i; j<A.length; j++){
                if (A[j]<A[index]) index = j;
            }
            swap(A, i, index);
        }
    }
    
    static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static void printArr(int[] A){
        for (int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            selectMin(arr, i);
        }

        printArr(arr);

        sc.close();
    }
}