// check if there exists a subarray with sum divisible by k
import java.util.HashSet;
import java.util.Scanner;

public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(sumK(a, n, k));
    }

    static boolean sumK(int[] a, int n, int k){
        int[] prefixSum = new int[n];
        prefixSum[0] = a[0]%k;

        for(int i = 1; i<n; i++) prefixSum[i] = (prefixSum[i-1] + a[i])%k;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<n; i++){
            if(set.contains(prefixSum[i]) || prefixSum[i] == 0) return true;
            else set.add(prefixSum[i]);
        }

        return false;
    }
}

// count of subarray divisible by k
// check if there exists a subarray with sum divisible by n => o(1)