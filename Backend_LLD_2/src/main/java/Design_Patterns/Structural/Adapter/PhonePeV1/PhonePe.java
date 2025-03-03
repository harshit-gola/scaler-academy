package Design_Patterns.Structural.Adapter.PhonePeV1;

public class PhonePe {
    BankAPI bankAPI;
    FastTag fastTag;
    PhonePeLoan phonePeLoan;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
        fastTag = new FastTag();
        phonePeLoan = new PhonePeLoan();
    }

    public void rechargeFastTag(int amount) {
        fastTag.recharge(amount, bankAPI);
    }

    public void availLoan(int amount) {
        if (!phonePeLoan.checkEligibility(amount, bankAPI)) {
            System.out.println("Not eligible for loan");
        }
    }
}