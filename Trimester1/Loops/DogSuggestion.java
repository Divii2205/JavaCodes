import java.util.*;

public class DogSuggestion {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);

        System.out.println("Do you want a dog? (yes/no)");
        String dog = sc.nextLine();

        if (dog.equalsIgnoreCase ("yes")){
            System.out.println("Do you want a house or a guard dog?");
            String house = sc.nextLine();

            if (house.equalsIgnoreCase("house")){
                System.out.println("Do you want a small or a large dog?");
                String small = sc.nextLine();
                
                if (small.equalsIgnoreCase("small")){
                    System.out.println("Do you live in a cold climate? (yes/no)");
                    String cold = sc.nextLine();

                    if (cold.equalsIgnoreCase("yes")){
                        System.out.println("You can either get a ShihTzu or a Pomerian!");

                    } else if (cold.equalsIgnoreCase("no")){
                        System.out.println("You can either get a Chihuahua or a Poodle!");
                    } else {
                        System.out.println("Wrong input!");
                    }
                    
                } else if (small.equalsIgnoreCase("large")) {
                    System.out.println("Do you live in a cold climate? (yes/no)");
                    String cold = sc.nextLine();

                    if (cold.equalsIgnoreCase("yes")){
                        System.out.println("You can either get a Siberian Husky or a Bernese Mountain Dog!");
                        
                    } else if (cold.equalsIgnoreCase("no")){
                        System.out.println("You can either get a Labrador or a Golden Retriever!");
                    } else {
                        System.out.println("Wrong input!");
                    }
                } else {
                    System.out.println("Wrong input!");
                }
            
            } else if (house.equalsIgnoreCase("guard")){
                System.out.println("Do you want a ferocious or a playful guard dog?");
                String playful = sc.nextLine();

                if (playful.equalsIgnoreCase("ferocious")){
                    System.out.println("Do you live in a cold climate? (yes/no)");
                    String cold = sc.nextLine();

                    if (cold.equalsIgnoreCase("yes")){
                        System.out.println("You can either get a Alaskan Malamute or a Tibetan Mastiff!");
                    } else if (cold.equalsIgnoreCase("no")){
                        System.out.println("You can either get a German Sheperd or a BullMastiff!");
                    } else {
                        System.out.println("Wrong input!");
                    }
    
                } else if (playful.equalsIgnoreCase("playful")) {
                    System.out.println("Do you live in a cold climate? (yes/no)");
                    String cold = sc.nextLine();

                    if (cold.equalsIgnoreCase("yes")){
                        System.out.println("You can either get a Keeshond or a Saint Bernard!");
                    } else if (cold.equalsIgnoreCase("no")){
                        System.out.println("You can either get a Boxer or a Doberman!");
                    } else {
                        System.out.println("Wrong input!");
                    }
                } else {
                    System.out.println("Wrong input!");
                }

            } else {
                System.out.println("Wrong input!");
            }
        
        } else if (dog.equalsIgnoreCase ("no")){
            System.out.println("Okay thank you!");
        } else {
            System.out.println("Wrong input!");
        }

        sc.close();
    }
}
