package Trimester2;

public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int len = arr.length;
        
        // int count = 0;
        
        // for (int i = 0; i<len; i++){
            
        //     for (int j = count; j<i+1; j++){
        //         System.out.print(arr[j]);
        //     }
            
        //     System.out.println();
            
        //     if (i==len-1){
        //         count++;
        //         i=count-1;
        //         System.out.println();
        //     }
        // }

        for (int i = 0; i<len; i++){
            for (int j = i; j<len; j++){
                for (int k = i; k<j+1; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}