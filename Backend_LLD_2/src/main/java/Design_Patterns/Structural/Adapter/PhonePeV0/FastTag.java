package Design_Patterns.Structural.Adapter.PhonePeV0;

public class FastTag {
    public boolean recharge(int amount, YesBankAPI yesBankAPI) {
        if (yesBankAPI.balanceCheck() >= amount) {
            System.out.println("Successfully Recharged");
            return true;
        }
        return false;
    }
}
