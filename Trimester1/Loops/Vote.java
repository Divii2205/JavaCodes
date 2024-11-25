import java.util.*;

public class Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int currentAge = scanner.nextInt();
        int laterAge = currentAge + 5;

        if (currentAge >  1 && currentAge < 120){
       		if (laterAge>=18){
                	System.out.println ("Eligible");
       		 } else {
                	System.out.println ("Not Eligible");
        	}
	} else {
		System.out.println ("Invalid Age, enter again!");
	}
	scanner.close();
    }
}
