package Test;
import java.util.*;
public class unique {
    static ArrayList<Integer> solve(int[][] mat){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count =0;
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                count = 0;
                for(int k=0;k<mat[0].length;k++){
                    if(mat[i][j]==mat[i][k]){
                        count++;
                    }
                }
                if(count==1){
                    list.add(mat[i][j]);
                }
            }
        }
        return list;
    } 
    public static void main(String[] args) {
       
      int[][]  mat= {{3,6,1,3},
                    {2,2,2,4},
                    {5,6,5,6}
                    ,{7,8,9,7}
                    };
        System.out.println(solve(mat));
        
    }
}