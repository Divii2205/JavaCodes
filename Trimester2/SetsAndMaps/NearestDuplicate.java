// Given an array, return the min diff between index of any 2 duplicate elements

import java.util.HashMap;
import java.util.Scanner;


public class NearestDuplicate {
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

        int min = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            if(map.containsKey(a[i])){
                int index = map.get(a[i]);
                min = Math.min(min, i-index);
                map.put(a[i], i);
            } else map.put(a[i], i);
        }

        return min;
    }
}

// return the max diff between the duplicate elements