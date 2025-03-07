package Design_Patterns.Structural.Adapter.PhonePeV0;

public class PhonePe {
    YesBankAPI yesBankAPI;
    FastTag fastTag;
    PhonePeLoan phonePeLoan;

    public PhonePe() {
        yesBankAPI = new YesBankAPI();
        fastTag = new FastTag();
        phonePeLoan = new PhonePeLoan();
    }

    public void rechargeFastTag(int amount) {
        fastTag.recharge(amount, yesBankAPI);
    }

    public void availLoan(int amount) {
        if (!phonePeLoan.checkEligibility(amount, yesBankAPI)) {
            System.out.println("Not eligible for loan");
        }
    }
}