package TankGun;

public class RoundLoader {
    final private Round [] trayRounds = new Round[20];  // Khay chứa đạn
    private int numRounds = 0;                        // Số lượng đạn đang có trong khay đạn

    public RoundLoader(){
        System.out.println("Auto Round Loader is activated!");
    }

    public void chargeRounds(Round [] tankRounds){  // Nạp đạn từ ngoài vào khay đạn

        for (int i = numRounds; i < tankRounds.length; i++) {
            this.trayRounds[i] = tankRounds[i];

            System.out.println("* Charging a round " + tankRounds[i].getType() + " " + tankRounds[i].getCalibre() + " mm");
        }

        numRounds += tankRounds.length;

        System.out.println(numRounds + " tank rounds are charged!");
    }

    public Round loadOneRound(){   // Nạp một viên đạn trong khay đạn lên nòng đại bác
        numRounds--;
        System.out.println("... A round " + trayRounds[numRounds].getType() + " " + trayRounds[numRounds].getCalibre() + " mm" + " is loaded. There are " + numRounds + " round(s).");
        return trayRounds[numRounds];
    }
}
