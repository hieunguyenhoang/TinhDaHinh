package bai42_Overriding;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("toi an sau bo");
    }
    @Override
    public void makeSound() {
        System.out.println("cuc cu cuc cu");
    }
}
