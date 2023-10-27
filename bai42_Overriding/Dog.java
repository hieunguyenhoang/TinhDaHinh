package bai42_Overriding;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Toi an xuong!");
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}
