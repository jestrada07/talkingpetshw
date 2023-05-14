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


            Pet pet; // pet instance
            switch (petType) { //
                case "Dog": //checks if case matches the expression "Pet Type"
                    pet = new Dog(petName); // new instance of pet - creates a dog and takes in a petName argument
                    break;
                case "Cat":
                    pet = new Cat(petName);
                    break;
                case "Frog":
                    pet = new Frog(petName);
                    break;
                default:
                    pet = new Pet(petName, petType); // default: you can create any pet type and give it a name
                    break;
            }
            pets.add(pet); //adds the pets created to the pets list.
        }

        System.out.println("Here are your pets:");
        for (Pet pet : pets) { //loops through the pets created
            System.out.println(pet.getName()); //get their name -  prints out and lists their name


        }
        System.out.println("Here are what your pets say:");
        for (Pet pet : pets) { //loops through pets created
            System.out.println(pet.speak()); //prints out and lists what they say.
        }


    }
}