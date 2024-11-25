import java.util.Scanner;

public class RotateArrKTimes {

    // static void rotateArr(int[] A){
    //     int first = A[0];
    //     for (int j = 0; j<A.length-1; j++) A[j] = A[j+1];
    //     A[A.length-1] = first;
    // }

    // static void repeatK(int[] A, int K) {
    //     for (int i = 0; i<K; i++) rotateArr(A);
    // }

    // static void printArr(int[] A){
    //     for (int i = 0; i<A.length; i++) System.out.print(A[i] + " ");
    //     System.out.println();
    // }
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
        
    //     int N = sc.nextInt();
    //     int[] A = new int[N];

    //     for (int i = 0; i<N; i++) A[i] = sc.nextInt();

    //     int K = sc.nextInt();
    //     K = K%N;

    //     repeatK(A, K);
    //     printArr(A);
        
    //     sc.close();

    //  -------------------

    // Optimised solution
    static void reverse (int[] A, int s, int e){
        int first = A[0];
        for (int j = 0; j<A.length-1; j++) A[j] = A[j+1];
        A[A.length-1] = first;
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

        int K = sc.nextInt();
        K = K%N;
        
        reverse(A, K, N-K);
        printArr(A);
        
        sc.close();
    }
}
