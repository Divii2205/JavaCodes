import java.util.*;

public class TwoDArray{

    static void TwodArray(int[][] A){
        int N = A.length;
        int M = A[0].length;

        for (int i = 0; i<N; i++){
            for (int j = 0; j<M; j++) System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int [][] A = new int[N][M];

        for (int i = 0; i<N; i++){
            for (int j = 0; j<M; j++) A[i][j] = sc.nextInt();
        }
        TwodArray(A);
        sc.close();
    }
}

// RR - TB
// RR - BT
// RR - 
// CC - LR
// CC - RL