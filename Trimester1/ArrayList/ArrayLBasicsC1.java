import java.util.*;

// Dynamic Array = ArrayList in java
// Dynamic Array = Vectors in cpp
// Dynamic Array = List in python
public class ArrayLBasicsC1 {
    
    public static void main(String[] args) {
        
        // Arraylist<Integer>() --> Constructor Function
        // Constructor Functions name is the same as the name of the class !!
        
        // ArrayLists cannot be created using the 'primitive' datatypes like int, float, etc
        // Instead classes like Integer, Long, Double, etc is used --> class of int datatype is Integer
        
        // list.add(5021160); // to add value to the ArrayList
        // list.get(index); // Returns the value at the given index of the ArrayList
        // list.set (index, val); // Replaces the value at the given index of the ArrayList with the given 'val'
        
        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        int row = sc.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i<row; i++){
            for (int j = 0; j<column; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printList(findUnique(arr));
    }
    static ArrayList<Integer> findUnique (int[][] A){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i<A.length; i++){
            for (int j = 0; j<A[0].length; j++){
                if (freq(A[i], A[i][j]) == 1){
                    list.add (A[i][j]);
                    // System.out.println(A[i][j]);
                }
            }
        }
        return list;
    }
    
    static void printList (ArrayList<Integer> A){
        for (int i = 0; i<A.size(); i++) System.out.print(A.get(i) + " ");
        System.out.println();
    }
    
    static int freq(int[] A, int k){
        int count = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] == k){
                count++;
            }
        }
        // System.out.println(count);
        return count;
    }
    
}