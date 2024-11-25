import java.util.Scanner;

public class RotateArrByOne {

    static void rotateArr(int[] A){
        int first = A[0];

        for (int i = 0; i<A.length-1; i++) A[i] = A[i+1];

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

        rotateArr(A);
        printArr(A);
        
        sc.close();
    }
}
