import java.util.Scanner;

public class DuplicateElArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i<N; i++) A[i] = sc.nextInt();

        boolean flag = false;
        for (int i = 0; i<N-1; i++) {
            if (A[i] == A[i+1]){
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println(false);
        else System.out.println(true);
    }
}
