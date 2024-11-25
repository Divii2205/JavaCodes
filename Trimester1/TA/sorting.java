
public class sorting {

    
    static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    static void printArr(int[] A){
        for (int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    // ------Insertion Sort------
    // static void insertionSort(int[] A){
    //     for (int i = 0; i<A.length-1; i++){
    //         for (int j = i+1; j>0; j--){
    //             if (A[j] < A[j-1]) swap (A, j ,j-1);
    //             else break; 
    //         }
    //     }
    // }

    // ------Bubble Sort------
    // static void bubbleSort(int[] A){
    //     for (int i = 0; i<A.length; i++){
    //         for (int j = 0; j<A.length-1; j++){
    //             if (A[j]>A[j+1]){
    //                 swap(A, j, j+1);
    //             }
    //         }
    //     }
    // }

    // ------Selection Sort------
    static void selectionSort(int[] A){
        for (int i = 0; i<A.length; i++){
            // int min = Integer.MAX_VALUE;
            int index = i;
            for (int j = i+1; j<A.length; j++){
                if (A[j]<A[index]){
                    index = j;
                }
            }
            swap (A, i, index);
        }
    }

    public static void main(String[] args){
        int[] arr = {7, 50, 8, 1, 8};
        // insertionSort(arr);
        // bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
