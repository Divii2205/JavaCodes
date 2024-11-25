import 	java.util.*;

class Input{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print ("Enter Input1: ");
	int input1 = scanner.nextInt();

	System.out.print ("Enter Input2: ");
	int input2 = scanner.nextInt();

	//int sum = input1 + input2;
	//System.out.println("Sum of "+input1+ " and "+input2+" is "+sum);
	
	//boolean result = (input1>input2);
	//System.out.println(input1+" > " + input2+" is "+ result);

	boolean result = (input1<input2) && (input2==(2*input1));
	System.out.println(result);	

	scanner.close();
	}	
}
