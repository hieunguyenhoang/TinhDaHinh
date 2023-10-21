package Polymorphism;

public class NewTubeSystem {
    public static void main(String[] args) {
        LoginManagerImproved loginManager = new LoginManagerImproved();

        User user = new PaidUser("hieu@gmail.com", "1111", "hieu", "Pro");
        loginManager.processLogin(user);

        user = new EnterpriseUser("vy@gmail.com", "2222", "vy", "saigonxanh");
        loginManager.processLogin(user);

        user = new AdministratorUser("huong@gmail.com", "3333", "huong", "Lv1");
        loginManager.processLogin(user);

        user = new UniversityUser("hoanghieu@gmail.com", "4444", "hiu", "SGU");
        loginManager.processLogin(user);
    }
}
