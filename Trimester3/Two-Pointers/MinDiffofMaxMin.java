import java.util.Scanner;

public class MinDiffofMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i = 0; i<m; i++) b[i] = sc.nextInt();

        int l = sc.nextInt();
        int[] c = new int[l];

        for(int i = 0; i<l; i++) c[i] = sc.nextInt();

        System.out.println(minDiff(a, b, c));
    }

    static int minDiff(int[] A, int[] B, int[] C){
        int ans = Integer.MAX_VALUE;
        int a = 0, b = 0, c = 0;

        while(a<A.length && b<B.length && c<C.length){
            int max = Math.max(Math.max(A[a], B[b]), C[c]);
            int min = Math.min(Math.min(A[a], B[b]), C[c]);

            int diff = max-min;
            ans = Math.min(ans, diff);

            if(A[a] == min) a++;
            else if(B[b] == min) b++;
            else c++;
        }
        
        return ans;
    }
}
