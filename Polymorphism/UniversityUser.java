package Polymorphism;

public class UniversityUser extends User {
    private String university;

    public UniversityUser(String email, String password, String nickname, String university) {
        super(email, password, nickname);
        this.university = university;
    }

    @Override
    public void login() {
        System.out.println("Checking email and password and university");
        System.out.println("Hello " + this.nickname + "!");
    }

    @Override
    public void enterpage() {
        System.out.println("Hello " + this.university + " University Page!");
    }
}
