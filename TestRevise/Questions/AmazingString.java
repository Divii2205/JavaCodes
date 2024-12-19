package TestRevise.Questions;
import java.util.*;

public class AmazingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toLowerCase();

        int count = 0;

        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                count += word.length() - i;
            }
        }

        System.out.println(count%10003);
    }
}
