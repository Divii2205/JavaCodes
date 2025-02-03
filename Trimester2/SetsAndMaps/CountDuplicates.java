import java.util.HashMap;
import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(count(a));
    }

    static int count(int[] a){
        int n = a.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for(int i = 0; i<n; i++){
            if(map.containsKey(a[i])){
                ans += map.get(a[i]);
                map.put(a[i], map.get(a[i])+1);
            } else map.put(a[i], 1);
        }

        return ans;
    }
}
