import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left in the buffer
        List<Pet> pets = new ArrayList<>(); //list that takes in pets inside the angle brackets


        for (int i = 1; i <= numOfPets; i++) {
            System.out.println("What kind of pet is pet #" + i + "?");
            String petType = scanner.nextLine();
            System.out.println("What is pet #" + i + "'s name?");
            String petName = scanner.nextLine();


            if (petType.equals("Dog")) {
                pets.add(new Dog(petName));
            } else if (petType.equals("Cat")) {

                pets.add(new Cat(petName));
            } else if (petType.equals("Frog")) {
                pets.add(new Frog(petName));
            }






            }
        System.out.println("Here are your pets and what they say...");
        for (Pet pet : pets) { //loops through the pets created
            System.out.println("Pet name is " + pet.getName() + " and he says " + pet.speak()); //get their name -  prints out and lists their name



        }
    }

}