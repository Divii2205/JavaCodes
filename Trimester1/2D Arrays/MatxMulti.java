// import java.util.Scanner;

// public class MatxMulti {

//     static int mulSum(int index, int[][] A, int[][] B, int[][] C){

//         for (int i = 0; i<B[0].length; i++){
//             int sum = 0;
//             for (int j = 0; j<B.length;  j++){
//                 sum += A[index][j]*B[j][i];
//             }
//             C[index][i] = sum;
//         }   
//         return 0;
//     }
    
//     static int[][] multiply(int[][] A, int[][] B){
//         int [][] C = new int[A.length][B[0].length];
        
//         for (int i = 0; i<A.length; i++){
//             mulSum (i, A, B, C);
//         }
//         printArr(C);
//         return C;
//     }

//     static void printArr(int[][] A){
//         for (int i = 0; i<A.length; i++){
//             for (int j = 0; j<A[0].length; j++){
//                 System.out.print(A[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static void create(int[][]A, int N, int M){
//         Scanner sc = new Scanner (System.in);

//         for (int i = 0; i<N; i++){
//             for (int j = 0; j<M; j++) A[i][j] = sc.nextInt();
//         }

//         System.out.println();
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         int N1 = sc.nextInt();
//         int M1 = sc.nextInt();

//         int [][] A = new int[N1][M1];
//         create(A, N1, M1);

//         int N2 = sc.nextInt();
//         int M2 = sc.nextInt();

//         int [][] B = new int[N2][M2];
//         create(B, N2, M2);

//         multiply(A, B);

//     }
// }

import java.util.*;

public class MatxMulti {
    static int[][] multiply(int[][] A, int[][] B){
        int[][] C = new int[A.length][B[0].length];
        
        for (int i = 0; i<A.length; i++){
            for (int j = 0; j<B[0].length; j++){
                for (int k = 0; k<B.length; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }

        return C;
    }

}