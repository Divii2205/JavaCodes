// return all elements with frequency 1

import java.util.*;
public class ArrayLBasicsC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        int n = sc.nextInt();
        inputList(list, n);
        System.out.println(findUnique(list));
    }

    static ArrayList<Integer> inputList(ArrayList<Integer> list, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<n; i++ ) list.add(sc.nextInt());
        return list;
    }

    static ArrayList<Integer> findUnique (ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i<list.size(); i++){
            int count = 0;
            for (int j = 0; j<list.size(); j++){
                if ((list.get(i)).equals(list.get(j))) count++;
            }

            if (count == 1) newList.add (list.get(i));
        }
        return newList;
    }
}
