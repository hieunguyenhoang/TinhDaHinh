package TankGun;

public class Round {
    protected int calibre;
    protected String roundType = "";

    public Round() {}

    public Round(int calibre, String roundType) {
        this.calibre = calibre;
        this.roundType = roundType;
        System.out.println("checking a tank gun round " + calibre + " mm");
    }

    protected void fired() {
        System.out.println("===> Fire a tank gun round " + roundType + " " + calibre + " mm");
    }

    public String getType() {
        return roundType;
    }

    public int getCalibre() {
        return calibre;
    }
}
