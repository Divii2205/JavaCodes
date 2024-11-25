// Insertion Sort -- lastElSort
import java.util.Scanner;

public class InsertionSort{

    static void arrange(int[] A){
        for (int i = 0; i < A.length-1; i++){
            for (int j = i+1; j>0; j--){
                if (A[j]<A[j-1]) swap(A, j, j-1);
                else break;
            }
        }
    }

    static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static void printArr(int[] A){
        for (int i = 0; i<A.length; i++) System.out.print(A[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i<N; i++) A[i] = sc.nextInt();
        
        arrange(A);
        printArr(A);
        
        sc.close();
    }
}
