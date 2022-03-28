package temp;

public class Lion extends Animal{
    private boolean isWild;

    public Lion(int age, String gender, String name, boolean isWild) {
        super(age, gender, name);
        this.isWild = isWild;
    }

    public boolean isIsWild() {
        return this.isWild;
    }

    public boolean getIsWild() {
        return this.isWild;
    }

    public void setIsWild(boolean isWild) {
        this.isWild = isWild;
    }

    //TODO run(): Implement the run method

    @Override
    public String toString() {
        return "The Lions name is: " + getName() +
                " Age: " + getAge() +
                " Gender: " + getGender();
    }
}
