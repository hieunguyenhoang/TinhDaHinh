package Polymorphism;

public class EnterpriseUser extends User{
    private String company;

    public EnterpriseUser(String email, String password, String nickname, String company) {
        super(email, password, nickname);
        this.company = company;
    }

    @Override
    public void login() {
        System.out.println("Checking email and password and company");
        System.out.println("Hello " + this.nickname + "!");
    }

    @Override
    public void enterpage() {
        System.out.println("Enter page " + this.company + " Enterprise Page!");
    }
}
