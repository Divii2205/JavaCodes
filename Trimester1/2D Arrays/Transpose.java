import java.util.*;

public class Transpose{
    static void modify(int[][] A){
        for (int i = 1; i<A.length; i++){
            for (int j = 0; j<i; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    static void printArr(int[][] A){
        for (int i = 0; i<A.length; i++){
            for (int j = 0; j<A.length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        int [][] A = new int[N][N];

        for (int i = 0; i<N; i++){
            for (int j = 0; j<N; j++) A[i][j] = sc.nextInt();
        }

        System.out.println();

        modify (A);
        printArr(A);
    }
}