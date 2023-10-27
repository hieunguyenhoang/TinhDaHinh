package bai42_Overriding;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("toi an ca");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo meo");
    }
}
