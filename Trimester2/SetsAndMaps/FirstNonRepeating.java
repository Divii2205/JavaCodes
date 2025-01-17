import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }

        for (int i = 0; i < n; i++) {
            if(map.get(a[i]) == 1){
                System.out.println(a[i]);
                break;
            }
        }
        
        // Provides the smallest and not the first non repeating element
        // Set<Integer> set = map.keySet();

        // for (Integer i : set){
        //     if(map.get(i)==1){
        //         System.out.println(i);
        //         break;
        //     }
        // }

    }
}
