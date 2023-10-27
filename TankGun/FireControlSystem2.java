package TankGun;

public class FireControlSystem2 extends FireControlSystem1{
    public FireControlSystem2() {}

    @Override
    public void fireOneRound(Round gunRound) {
        if((gunRound.getType().equals("APDS")) || (gunRound.getType().equals("HE"))) {
            gunRound.fired();
        }
        else {
            System.out.println("Invalide round type!");
        }
    }
}
