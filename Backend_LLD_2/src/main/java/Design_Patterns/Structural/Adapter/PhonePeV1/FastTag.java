package Design_Patterns.Structural.Adapter.PhonePeV1;

public class FastTag {
    public boolean recharge(int amount, BankAPI bankAPI) {
        if (bankAPI.getBalance() >= amount) {
            System.out.println("Successfully Recharged");
            return true;
        }
        return false;
    }
}
