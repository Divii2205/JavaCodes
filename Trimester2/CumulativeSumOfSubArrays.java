package Trimester2;

public class CumulativeSumOfSubArrays {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumOfSubArrays(arr));
    }

    static int sumOfSubArrays(int[] arr){
        // int len = arr.length;

        // int totalSum = 0;

        // for (int i = 0; i<len; i++){
        //     int sum = 0;
        //     for (int j = i; j<len; j++){
        //         sum += arr[j];
        //         totalSum += sum;
        //     }
        // }
        // return totalSum;

        int len = arr.length;

        int totalSum = 0;

        for (int i = 0; i<len; i++){
            int sum = 0;
            for (int j = i; j<len; j++){
                sum += arr[j];
                totalSum += sum;
            }
        }
        return totalSum;
    }
}