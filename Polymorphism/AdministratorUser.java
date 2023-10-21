package Polymorphism;

public class AdministratorUser extends User{
    private String adminLevel;

    public AdministratorUser(String email, String password, String nickname, String adminLevel) {
        super(email, password, nickname);
        this.adminLevel = adminLevel;
    }

    @Override
    public void login() {
        System.out.println("Checking email and password and permission");
        System.out.println("Hello " + this.nickname + "!");
    }

    @Override
    public void enterpage() {
        System.out.println("Please verify your permission: " + this.adminLevel);
        System.out.println("Enter the " + this.adminLevel + " Admin Page!");
    }
}
