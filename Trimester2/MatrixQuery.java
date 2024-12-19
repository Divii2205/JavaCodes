import java.util.Scanner;

public class MatrixQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++) matrix[i][j] = sc.nextInt();
        }

        int[][] neww = new int[N][M];

        for (int i = 0; i<N; i++){
            int sum = 0;
            for (int j = 0; j<M; j++){
                sum += matrix[i][j];
                neww[i][j] = sum;
            }
        }

        // System.out.println();

        // for(int i = 0; i<N; i++){
        //     for(int j = 0; j<M; j++) System.out.print(neww[i][j] + " ");
        //     System.out.println();
        // }

        // System.out.println();

        int Q = sc.nextInt();
        while(Q-->0){
            int tlx = sc.nextInt();
            int tly = sc.nextInt();
            int brx = sc.nextInt();
            int bry = sc.nextInt();

            int sum = 0;
            
            for(int i = tlx; i<=brx; i++){
                sum += neww[i][bry];
                if (tly != 0) sum = sum - neww[i][tly-1];
            }

            System.out.println(sum);
        }  
    }
}
