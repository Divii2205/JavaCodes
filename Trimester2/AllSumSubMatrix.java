// -------brutforce: n power 6------
// optimised solution: 

import java.util.Scanner;

public class AllSumSubMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++) matrix[i][j] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                sum += matrix[i][j]*(i+1)*(j+1)*(N-i)*(M-j);
            }
        }
        System.out.println(sum);
    }
}
