import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for(int i = 0; i<n; i++) A[i] = sc.nextInt();

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = 0;
        rightMax[n-1] = 0;
        
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], A[i-1]);
        }
        
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], A[i+1]);
        }
        
        int[] min = new int[n];
        
        for(int i = 0; i<n; i++){
            min[i] = Math.min(leftMax[i], rightMax[i]);
        }
        
        int ans = 0;
        
        for(int i = 0; i<n; i++){
            if(A[i]<min[i]) ans += min[i] - A[i];
        }
        System.out.println(ans);
    }
}

        // int abMax = 0;
        // for(int i = 0; i<n; i++) abMax = Math.max(abMax, arr[i]);

        // int startindex = 0;
        // for(int i = 1; i<N; i++){
        //     if(arr[i]<arr[i-1]){
        //         startindex = arr[i-1];
        //         break;
        //     }
        // }

        // int endindex = 0;
        // for(int i = N-1; i>startindex; i--){
        //     if(arr[i]<arr[i-1]){
        //         endindex = arr[i-1];
        //         break;
        //     }
        // }
        // System.out.println(endindex);

//         int count = 0;
//         int max = 0;
        
//         for(int i = startindex; i<N ; i++){
//             if (arr[i] == abMax){
//                 continue;
//             } else if(arr[i] > max){
//                 max = arr[i];
//             } else{
//                 count += max-arr[i];
//                 System.out.println(count);
//             }
//         }

//         System.out.println(count);
//     }
// }


// trial:
// public class Solution {
//     // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
//     public int trap(final int[] A) {
//         int n = A.length;

//         if(n == 0 || n == 1 || n == 2) return 0;

//         ArrayList<Integer> list = new ArrayList<Integer>();

//         for(int i=0; i<n; i++){
//             if(i==0){
//                 if(A[i] > A[i+1]) list.add(i);
//             } else if(i==n-1){
//                 if(A[i] > A[i-1]) list.add(i);
//             } else {
//                 if(A[i] > A[i-1] && A[i] >= A[i+1]) list.add(i);
//             }
//         }

//         if(list.size() == 1) return 0;

//         int firstMax = 0;
//         int secondMax = 0;

//         int[] value = new int[list.size()];
//         for(int i = 0; i<list.size(); i++){
//             value[i] = A[list.get(i)];
//             if(value[i] > firstMax) firstMax = value[i];
//         }

//         for(int i = 0; i<list.size(); i++){

//         }

//         int count = 0;

//         for(int i = 0; i<list.size()-1; i++){
//             int min = Math.min(A[list.get(i+1)], A[list.get(i)]);

//             for(int j = list.get(i); j<=list.get(i+1); j++){
//                 if(A[j] <= min){
//                     count += (min-A[j]);
//                 }
//             }
//         }

//         return count;
//     }
// }