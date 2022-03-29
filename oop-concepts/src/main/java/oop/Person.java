package oop;

//User Defined Blueprint
public class Person {
    //Fields
    //Encapsulation
    private String firstName;
    private String lastName;
    private int age;

    //Default Constructor
    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    //Parameterized Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //To String
    @Override
    public String toString() {
        return getFirstName();
    }

}
