package Polymorphism;

public class User {
    private String email;
    private String password;
    protected String nickname;

    public User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    public void login() {
        System.out.println("Checking email and password");
        System.out.println();
    }

    public void enterpage() {
        System.out.println("Enter the default page!");
    }
}