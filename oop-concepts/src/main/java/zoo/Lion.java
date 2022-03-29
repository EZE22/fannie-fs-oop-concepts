package zoo;

public class Lion extends Animal{
    private boolean isWild;

    public Lion(int age, String gender, String name, boolean isWild) {
        super(age, gender, name);
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public String toString() {
        return "Lion name: " + getName() + " Age: " + getAge();
    }
}
