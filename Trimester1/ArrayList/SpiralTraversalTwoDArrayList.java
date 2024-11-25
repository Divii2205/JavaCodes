import java.util.*;

public class SpiralTraversalTwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        listInput(list);
        System.out.println(spiralTraversal(list));
    }

    static ArrayList<ArrayList<Integer>> listInput(ArrayList<ArrayList<Integer>> list){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            ArrayList<Integer> empty = new ArrayList<Integer>();
            list.add(empty);

            for (int j = 0; j<n; j++) empty.add(sc.nextInt());
        }
        return list;
    }

    static ArrayList<Integer> spiralTraversal(ArrayList<ArrayList<Integer>> list){
        ArrayList<Integer> traveresedList = new ArrayList<Integer>();

        int top = 0;
        int bottom = list.size()-1;
        int left = 0;
        int right = list.size()-1;

        
        while(top<=bottom){

            for (int j = left; j<=right; j++){
                traveresedList.add(list.get(top).get(j));
            }
            top ++;
            for (int j = top; j<=bottom; j++){
                traveresedList.add(list.get(j).get(right));
            }
            right --;
            for (int j = right; j>=left; j--){
                traveresedList.add(list.get(bottom).get(j));
            }
            bottom --;
            
            for (int j = bottom; j>=top; j--){
                traveresedList.add(list.get(j).get(left));
            }
            left ++;
        }
        return traveresedList;
    }
}
