package Design_Patterns.Structural.Adapter.PhonePeV1;

public class YesBankAPIAdapter implements BankAPI {
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int getBalance() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void transfer() {
        yesBankAPI.moneyTransfer();
    }
}
