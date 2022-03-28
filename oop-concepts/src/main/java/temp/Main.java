package temp;

import the_zoo.*;

import java.util.ArrayList;
import java.util.Arrays;

//TODO Make A Working Problem

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Instantiate a new Person object.
        Person adam = new Person();

        //Print the object using the toString method.
        System.out.println(adam);

        //Use the getters and setters

//**********************************************************
        //THE ZOO
        Zoo zoo = new Zoo("Ingram Zoo", "1806 Calloway");

        Animal lion = new Lion(50, "Male", "Killer", true);
        Animal duck = new Duck(1, "male", "Donald");
        Animal fish = new Fish(1, true, 25, "male", "Dory");

        zoo.setAnimals(new ArrayList<>(Arrays.asList(lion, duck, fish)));

        System.out.println("\n" + zoo.getAnimals());

    }
}
