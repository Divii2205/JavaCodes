import java.util.Scanner;

public class DeletingElementsEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i<N; i++) A[i] = sc.nextInt();
        
        // -------brutforce = n^2-------
        // int ans = 0;
        
        // for(int i = 0; i<N; i++){
        //     int itrCount = 0;
        //     int even = 0;
        //     int odd = 0;
        //     for(int j = 0; j<N; j++){
        //         if(j != i){
        //             if(itrCount%2 == 0) even+=arr[j];
        //             else odd+=arr[j];
        //             itrCount++;
        //         }
        //     }
        //     if (even == odd) ans++;
        // }
        // System.out.println(ans);

        int n = A.length;

        int odd = 0;
        int even = 0;

        for(int i = 0; i<n; i++){
            if(i % 2 == 0) even += A[i];
            else odd += A[i];
        }

        int newOdd = 0;
        int newEven = 0;    

        int count = 0;

        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                even -= A[i];
                if (check(newOdd, newEven, odd, even)) count++;
                newEven += A[i]; 
            } else {
                odd -= A[i];
                if (check(newOdd, newEven, odd, even)) count++;
                newOdd += A[i]; 
            }
        }
        System.out.println(count);
    }

    static boolean check(int newOdd, int newEven, int odd, int even){
        if (newOdd + even == newEven + odd) return true;
        return false; 
    }
}
