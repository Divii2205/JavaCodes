import java.util.Scanner;

public class Query_s_e_val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        // for(int i = 0; i<N; i++) arr[i] = 0

        int Q = sc.nextInt();
        while(Q-->0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int val = sc.nextInt();

            arr[s] += val;
            if (e != N-1) arr[e+1] -= val;
        }
        
        int sum = 0;

        for(int i = 0; i<N; i++){
            sum += arr[i];
            arr[i] = sum;

            System.out.print (arr[i] + " ");
        }
    }
}