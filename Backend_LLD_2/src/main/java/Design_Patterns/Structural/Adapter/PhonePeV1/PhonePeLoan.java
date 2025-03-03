package Design_Patterns.Structural.Adapter.PhonePeV1;

public class PhonePeLoan {
    public boolean checkEligibility(int amount, BankAPI bankAPI) {
        if (bankAPI.getBalance() >= amount * 0.1) {
            System.out.println("Loan can be availed");
            return true;
        }
        return false;
    }
}