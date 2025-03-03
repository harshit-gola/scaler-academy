package Design_Patterns.Structural.Adapter.PhonePeV0;

public class PhonePeLoan {
    public boolean checkEligibility(int amount, YesBankAPI yesBankAPI) {
        if (yesBankAPI.balanceCheck() >= amount * 0.1) {
            System.out.println("Loan can be availed");
            return true;
        }
        return false;
    }
}