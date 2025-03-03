package Design_Patterns.Structural.Adapter.PhonePeV1;

public class ICICIBankAPIAdapter implements BankAPI {
    ICICIBankAPI icicibankAPI = new ICICIBankAPI();

    @Override
    public int getBalance() {
        return icicibankAPI.checkBalance();
    }

    @Override
    public void transfer() {
        icicibankAPI.tranferMoney();
    }
}
