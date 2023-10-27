package TankGun;

public class TankGun2 extends TankGun1 {
    final protected FireControlSystem1 fcs = new FireControlSystem2();  // Hiding

    public TankGun2(int gunType) {
        super(gunType);
    }

    @Override
    public void fire() {    // Overriding
        fcs.fireOneRound(roundLoader.loadOneRound());
    }
}
