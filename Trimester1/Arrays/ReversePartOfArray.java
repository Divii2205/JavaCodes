import java.util.Scanner;

public class ReversePartOfArray {

    static void reverse(int[] arr, int s, int e){
        for (int i = s; i<e; i++){
            int temp = arr[s];
            arr[s] = arr[e-s];
            arr[e-s] = temp;
        }
        
        for (int i = 0; i<arr.length; i++) System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i<N; i++) A[i] = sc.nextInt();

        int s = sc.nextInt();
        int e = sc.nextInt();

        reverse(A, s, e);
        sc.close();
    }
}
