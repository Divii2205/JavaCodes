import java.util.*;

public class DistInSubArrayK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(ans(a, n, k));
    }
    
    static ArrayList<Integer> ans(int[] a, int n, int k){
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<k; i++){
            if (map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }
        list.add(map.size());
        
        for(int i = k; i<n; i++){
            map.put(a[i-k], map.get(a[i-k])-1);
            if(map.get(a[i-k]) == 0) map.remove(a[i-k]);
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
            list.add(map.size());
        }

        return list;
    }
}
