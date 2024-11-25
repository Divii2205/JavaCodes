import java.util.*;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i<N ; i++){
            arr[i] = sc.nextInt();
        }

        // 1. Method 1
        // for (int i = 0; i<N/2 ; i++){
        //     if (arr[i] != arr[N-i-1]){
        //         flag = false;
        //         break;
        //     }
        // }

        // 2. Method 2
        int s = 0, e = N-1;
        while (s<e){
            if (arr[s] != arr[e]){
                flag = false;
                break;
            }
            s++;
            e--;
        }

        if (flag == true) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");

        sc.close();
    }
}
