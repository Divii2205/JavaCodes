import java.util.Scanner;

public class SubArrayQuerySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int q = sc.nextInt();

        int[][] queries = new int[q][2];

        for(int i = 0; i<q; i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] ps = new int[n];

        ps[0] = a[0];

        for(int i = 1; i<n; i++) ps[i] = ps[i-1] + a[i];

        int index = 0;
        while(index < q){
            int start = queries[index][0];
            int end = queries[index][1];

            if(start == 0) System.out.println(ps[end]);
            else System.out.println(ps[end] - ps[start-1]);
            index++;
        }
    }
}
