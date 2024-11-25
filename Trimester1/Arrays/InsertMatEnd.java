// Insert and element M at the end of an Array not knowing its length
// Introduction to Dynamic Array
import java.util.*;

public class InsertMatEnd {

    static int[] copy(int[] A){
        int[] newA = new int [A.length +1];
        // more oprtimised solution int[] new A = new int[2*A.length-1]; and modify rest of the code accordingly
        for (int i = 0; i<A.length; i++){
            newA[i] = A[i];
        }
        return newA;
    }

    static int[] add(int[] A, int num, int length){
        A = copy(A);
        A[A.length-1] = num;
        return A;
    }

    static void printArr(int[] A){
        for (int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] A = new int[0];
        int size = 0;

        while(true){
            int n = sc.nextInt();
            if (n != 0){
                A = add(A, n, size);
                printArr(A);
                System.out.println();
                size++;     
            } else break;
        }
        sc.close();
    }
}
