import java.util.HashMap;
import java.util.Scanner;

public class CountPairSumtoK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(count(a, k));
    }

    static int count(int[] a, int k){
        int n = a.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for(int i = 0; i<n; i++){
            int pair = k - a[i];
            if(map.containsKey(pair)){
                ans += map.get(pair);
            }
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }
        
        return ans;
    }
}
