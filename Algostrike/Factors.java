// Factors of a number until number N

import java.util.*;

public class Factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<ArrayList<Integer>> factors = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i<N; i++){
            factors.add(new ArrayList<>());
        }

        for (int i = 1; i<=N; i++){
            for (int j = i; j<=N; j+=i){
                factors.get(j-1).add(i);
            }
        }

        System.out.println(factors);
    }
}