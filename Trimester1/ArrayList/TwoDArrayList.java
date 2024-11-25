import java.util.*;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        int n = sc.nextInt();
        System.out.println(listInput(list, n));
    }

    static ArrayList<ArrayList<Integer>> listInput(ArrayList<ArrayList<Integer>> list, int n){
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0; i<n; i++){
            ArrayList<Integer> empty = new ArrayList<Integer>();
            list.add(empty);
            int len = sc.nextInt();
            for (int j = 0; j<len; j++) empty.add(sc.nextInt());
        }
        return list;
    }
}
