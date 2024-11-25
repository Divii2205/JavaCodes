//CountSort -- linear number of iterations

import java.util.Scanner;

public class CountSortString {

    static String sort(String str){
        StringBuilder newStr = new StringBuilder();
        int val = 'a';

        while (newStr.length() != str.length() && val<='z'){
            for (int i = 0; i<str.length(); i++){
                if (str.charAt(i) == val) newStr.append(str.charAt(i));
            }
            val++;
        }
        return newStr.toString();
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        System.out.println(sort(str));
    }
}
