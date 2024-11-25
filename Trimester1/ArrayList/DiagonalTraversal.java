import java.util.*;

public class DiagonalTraversal {
    
    static ArrayList<Integer> getDiagonal(ArrayList<ArrayList<Integer>> A, int i, int j){
        ArrayList<Integer> newList = new ArrayList<Integer>();

        int N = A.size();
        int M = A.get(0).size();

        while (i<N && j<M){
            newList.add(A.get(i).get(j));
            i++;
            j++;
        }

        return newList;
    }

    static ArrayList<ArrayList<Integer>> getAllDiagonal(ArrayList<ArrayList<Integer>> A){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for (int i = A.size()-1; i>=0; i--) ans.add(getDiagonal(A, i, 0));
        for (int i = 1; i <A.get(0).size(); i++) ans.add(getDiagonal(A, 0, i));
        
        return ans;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i<N; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            list.add(temp);
            for (int j = 0; j<M; j++) temp.add(sc.nextInt());
        }

        System.out.println(getAllDiagonal(list));
    }
}
