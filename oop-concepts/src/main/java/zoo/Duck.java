package zoo;

public class Duck extends Animal {
    //Fields
    private static final String BEAKCOLOR = "Yellow";

    //Override
    //Constructors
    public Duck(int age, String gender, String name) {
        super(age, gender, name);
    }

    //Methods
    public String quack() {
        return "I am quacking";
    }
    public String fly() {
        return "I am flying";
    }

    //Override Methods
    @Override
    public String swim() {
        return "Swimming as a DUCK!!!";
    }

    //To String
    @Override
    public String toString() {
        return "The Duck's name is " + getName() +
                " Age: " + getAge() +
                " Beak color is: " + BEAKCOLOR;
    }

}
