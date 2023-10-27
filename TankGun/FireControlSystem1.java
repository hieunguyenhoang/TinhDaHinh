package TankGun;

public class FireControlSystem1 {
    public FireControlSystem1() {}

    public void fireOneRound(Round gunRound) {
        if(gunRound.getType().equals("APDS")) {
            gunRound.fired();
        }
        else {
            System.out.println("Invalide round type!");
        }
    }
}
