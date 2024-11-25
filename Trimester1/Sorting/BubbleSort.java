//Bubble sort logic only

import java.util.*;

public class BubbleSort {

    static void swap(int[] A){
        for (int i= 0; i<A.length-1; i++){
            if (A[i] > A[i+1]){
                int temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
            }
        }
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

        for (int i = 0; i<N; i++){
            for (int j = 0; j<N; j++){
                swap(arr);
            }
        }
        printArr(arr);

        sc.close();
    }
}
