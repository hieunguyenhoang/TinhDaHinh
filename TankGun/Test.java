package TankGun;

public class Test {
    public static void main(String[] args) {
        Round [] trayRounds1 = new Round[20];
        Round [] trayRounds2 = new Round[20];

        for (int i = 0; i < 20; i++) {
            trayRounds1[i] = new RoundAPDS(105);
        }   

        for (int i = 0; i < 10; i++) {            
            trayRounds2[i] = new RoundAPDS(120);
            trayRounds2[10+i] = new RoundHE(120);
        }    

        // Create a tank gun 105mm
        TankGun1 tankGun1 = new TankGun1(105);

        // Charging rounds
        tankGun1.charge(trayRounds1);

        // Fire
        for (int i = 0; i < 20; i++)
        {
            tankGun1.fire();
        }       

        // Create a tank gun 120mm
        TankGun2 tankGun2 = new TankGun2(120);

        // Charging rounds
        tankGun2.charge(trayRounds2);

        // Fire
        for (int i = 0; i < 20; i++)
        {
            tankGun2.fire();
        }
    }
}
