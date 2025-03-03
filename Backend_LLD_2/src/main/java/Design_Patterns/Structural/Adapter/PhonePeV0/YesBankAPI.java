package Design_Patterns.Structural.Adapter.PhonePeV0;

public class YesBankAPI {
    public int balanceCheck() {
        System.out.println("YesBankAPI balanceCheck");
        return 10;
    }

    public void moneyTransfer() {
        System.out.println("Transferring money via YesBank");
    }
}
