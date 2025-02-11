// Time complexity: O(n+m)
// Space complexity: O(1)

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];

        for(int i = 0; i<m; i++) b[i] = sc.nextInt();

        print(merge(a, b));
    }
    
    static int[] merge(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        int[] ans = new int[n+m];
        
        int index = 0;

        int first = 0;
        int second = 0;

        while(first<n && second<m){
            if(a[first]>=b[second]) ans[index++] = b[second++];
            else ans[index++] = a[first++];
        }

        while(first<n) ans[index++] = a[first++];

        while(second<m) ans[index++] = b[second++];

        return ans;
    }

    static void print(int[] a){
        for(int i = 0; i<a.length; i++) System.out.print(a[i] + " ");
    }
}
