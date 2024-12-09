package Trimester2;

public class PrintSumOfSubArrays {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int len = arr.length;

        for (int i = 0; i<len; i++){
            int sum = 0;

            for (int j = i; j<len; j++){
                sum += arr[j];
                System.out.println(sum);
            }
            System.out.println();
        }
    }
}
