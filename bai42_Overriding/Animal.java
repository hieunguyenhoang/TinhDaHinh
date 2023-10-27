package bai42_Overriding;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("toi dang an...");
    }
    public void makeSound() {
        System.out.println("............");
    }
    public void sleep() {
        System.out.println("zzzzzzzzzzzz");
    }
}
