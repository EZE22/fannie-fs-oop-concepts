package zoo;

//User Defined Blueprint
public class Animal {
    //Fields
    private int age;
    private String gender;
    private String name;

    //Method Overloading - Different parameters and return type
    //Method Overriding - Same method signature return dynamic

    //Constructors
    public Animal() {
    }
    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    //Getters and Setters
    public int getAge() {
        return age;
    }
    public String getAge(String name) {
        return "Your name is: " + name + " And your age is: " + getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    public boolean isMammal() {
        return true;
    }
    public String swim() {
        return "I am swimming";
    }
    public String run() {
        return "I am running man hear me roar!!!";
    }

    //TODO Remove: We will be using inheritance so we will not need this.
    //To String
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //TODO Student Setup: Get with whomever needs help with setting up on personal machine.

}
