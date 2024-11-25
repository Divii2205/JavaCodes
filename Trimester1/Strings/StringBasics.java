// character to number mapping ---> one to one mapping
// mapping must be sequential
// mapping must be universal (standard mapping - ASCII)
// ASCII - American standard code for information interchange 

// lowercase a = 97 ...... z = 122
// uppercase A = 65 ...... Z = 90
// character zero '0' = 48 ...... '9' = 57

public class StringBasics {
    public static void main(String[] args) {
        String S = "abcdefghijklmnopqrstuvwxyz";

        for (int i =0; i<S.length(); i++) {
            // iterating over the string elements
            System.out.print(S.charAt(i) + " ");
            
            // printing the ASCII values of the characters
            System.out.println((int)S.charAt(i));
        }
    }
}
