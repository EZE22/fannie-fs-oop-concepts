//Notes
/*
 *  This is the end... :)
 *
 * //Naming Conventions
 * //projects name-name || name
 * //packages lowercase
 * //classes UpperCamelCase
 * //fields camelCase
 * //methods camelCase
 *
 * */

//Imports
import zoo.Animal;
import zoo.Fish;

//Class Declaration
public class AnimalMain {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Animal Mini Project");

        //Instantiation of a new Object
        Animal animal = new Animal(41, "Male",  "Adam Ingram");
        System.out.println("Animal Name:  " + animal.getName() + " \nAnimal Age:  " + animal.getAge());

        //Overloading Methods bear.getAge(empty) and bear.getAge(String)
        Animal bear = new Animal();
        bear.setName("Bear");
        bear.setAge(5);
        System.out.println(bear.getAge("Adam"));

        //Object 1
        Person adam = new Person();
        System.out.println("\nObject 1");
        System.out.println(adam);
        //set some state
        adam.setFirstName("Adam");
        adam.setLastName("Ingram");
        adam.setAge(41);
        System.out.println("First Name " + adam.getFirstName() +
                " Last Name: " + adam.getLastName() +
                " Age: " + adam.getAge());

        //Object 2
        Person lindsay = new Person("Lindsay", "Ingram", 25);
        System.out.println("\nObject 2");
        System.out.println(lindsay);
        System.out.println(lindsay.getFirstName() + " is my wife");

        //Object 3
        Person ellie = new Person("Ellie", "Ingram", 4);
        System.out.println("\nObject 3");
        System.out.println(ellie);
        System.out.println(ellie.getFirstName() + " is my daughter");

        //Fish 1
        Fish fish1 = new Fish();
        fish1.setAge(2);
        fish1.setName("Donald");
        System.out.println("Fish 1: " + fish1.getName() + " Age: " + fish1.getAge());
        System.out.println(fish1);

        //Fish 2
        Fish fish2 = new Fish(25, true);
        fish2.setName("Micky");
        System.out.println(fish2);

        //Fish 3
        Fish fish3 = new Fish(3, "male", "Flapper", 25, true);
        fish3.setName("Nemo");
        System.out.println(fish3);

    }
}