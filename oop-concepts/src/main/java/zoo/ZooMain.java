//Packages
package zoo;

//Imports
import oop.Person;
import java.util.*;

public class ZooMain {
    //Class Fields
    private static final Scanner scanner = new Scanner(System.in);
    private static final Zoo zoo = new Zoo("Ingram Zoo", "1806 Calloway");
    private static final Lion lion = new Lion(10, "Male", "Killer", true);
    private static final Duck duck = new Duck(7, "Male", "Donald");
    private static final Fish fish = new Fish(15, "Male", "Flapper", 25, true);

    public static void main(String[] args) {
        //Greeting
        System.out.println(greeting());

        //Add Some Animals to the Zoo!
        addAnimalsToZoo();

        //Register
        register();

        //Viewing Animals
        while (true) {
            switch (pickAnimal()) {
                case 1:
                    System.out.println("You are viewing the Duck!");
                    viewDuck();
                    break;
                case 2:
                    System.out.println("You are viewing the Fish!");
                    viewFish();
                    break;
                case 3:
                    System.out.println("You are viewing the Lion!");
                    viewLion();
                    break;
                case 4:
                    System.out.println("Thank you " + zoo.getVisitor().getFirstName() + " for visiting the " + zoo.getName() + "!");
                    System.exit(0);
                default:
                    System.out.println("Please pick either (1 - 4)");
            }
        }
    }

    //Methods
    public static String greeting(){
        return "Welcome to the Zoo!";
    }

    public static void addAnimalsToZoo() {
        //Declaring a new array list of animals
        ArrayList<Animal> animals = new ArrayList<>();

        //Adding the animals to the list
        animals.add(lion);
        animals.add(duck);
        animals.add(fish);

        //Setting animals array list to the zoo object array list
        zoo.setAnimals(animals);
        //zoo.setAnimals(new ArrayList<Animal>(Arrays.asList(lion, duck, fish)));
    }

    public static void register() {
        System.out.println("Lets get you registered!");
        System.out.println("Please enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Please enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        Person v1 = new Person(firstName, lastName, age);
        zoo.setVisitor(v1);
    }

    public static int pickAnimal() {
        System.out.println("""
                
                Please pick an Animal to view from the list below:
                1. Duck
                2. Fish
                3. Lion
                4. Exit
                """);
        return scanner.nextInt();
    }

    public static void viewDuck() {
        System.out.println(duck);
    }

    public static void viewFish() {
        System.out.println(fish);
    }

    public static void viewLion() {
        System.out.println(lion);
    }
}
