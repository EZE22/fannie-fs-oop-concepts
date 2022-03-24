//Comments
/*
* My Comments
* */

//Packages
package zoo;

//Java Imports

//Custom Imports

//Class Declaration
public class Fish extends Animal{
    //Fields
    private int sizeInFeet;
    private boolean canEat;

    //Constructor
    public Fish() {
    }

    public Fish(int sizeInFeet, boolean canEat) {
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }

    public Fish(int age, String gender, String name, int sizeInFeet, boolean canEat) {
        super(age, gender, name);
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }

    //Getters and Setters
    public int getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }
    //Methods

    //To String
    @Override
    public String toString() {
        return "Fish Name: " + getName() + " Fish Age: " + getAge();
    }
}
