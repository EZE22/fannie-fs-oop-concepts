package zoo;

import Interfaces.Speak;

public class Lion implements Speak {

    @Override
    public String makeSound() {
        return "Roar";
    }
}
