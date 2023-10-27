package TankGun;

public class TankGun1 {
    protected int gunType;  // 105mm hay 120mm
    final protected RoundLoader  roundLoader = new RoundLoader();   // Hệ thống nạp đạn
    final protected FireControlSystem1 fcs = new FireControlSystem1();  // Hệ thống điều khiển hỏa lực

    public TankGun1(int gunType){
        this.gunType = gunType;
        System.out.println("\nTank gun " + gunType + " is operating ...");
    }

    public void charge(Round [] trayRounds) {
        roundLoader.chargeRounds(trayRounds);   // Nạp một khay đạn vào RoundLoader
    }

    public void fire() {    // Overridden
        fcs.fireOneRound(roundLoader.loadOneRound()); // Bắn một viên đạn đã được lấy ra từ khay đạn của RoundLoader

    }    
}
