package Polymorphism;

public class LoginManagerImproved {
    public void processLogin(User user) {
        System.out.println("process something before login");
        user.login();
        user.enterpage();
        System.out.println("process something after login\n");
    }
}
