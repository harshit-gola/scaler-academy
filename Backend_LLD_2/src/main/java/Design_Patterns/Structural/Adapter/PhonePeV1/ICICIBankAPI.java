package Design_Patterns.Structural.Adapter.PhonePeV1;

public class ICICIBankAPI {
    public int checkBalance() {
        return 20;
    }

    public void tranferMoney() {
        System.out.println("Transferring money via ICICIBank");
    }
}
