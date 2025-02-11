// GIven an array and 3 indices l, m, r (l<m<=r)
// The subarray from [l to m-1] and [m to r] are sorted
// Sort the subarray from l to r

// Time complexity: O(n+m)
// Space complexity: O(n)

import java.util.Scanner;

public class MergeRotatedSortedSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int l = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        int[] ans = sortArr(a, l, m, r);
        
        int index = 0;

        for(int i = l; i<=r; i++) a[i] = ans[index++];

        print(a);
    }
    
    static int[] sortArr(int[] a, int l, int m, int r){
        int n = a.length;

        int[] ans = new int[r-l+1];

        int index = 0;

        int s = l;
        int e = m;

        while(s<m && e<=r){
            if(a[s] >= a[e]) ans[index++] = a[e++];
            else ans[index++] = a[s++];
        }

        while(s<m) ans[index++] = a[s++];

        while(e<=r) ans[index++] = a[e++];
        
        return ans;
    }

    static void print(int[] a){
        for(int i = 0; i<a.length; i++) System.out.print(a[i] + " ");
    }
}
