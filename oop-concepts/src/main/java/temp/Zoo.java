package temp;

import java.util.ArrayList;

public class Zoo {
    private String name; 
    private String address;
    private ArrayList<Animal> animals = new ArrayList<>();

    public Zoo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    //To String
    @Override
    public String toString() {
        return name + " Has the following Animals: " + getAnimals();
    }
    
}
