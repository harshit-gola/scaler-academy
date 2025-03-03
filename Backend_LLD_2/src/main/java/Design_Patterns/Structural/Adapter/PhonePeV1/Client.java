package Design_Patterns.Structural.Adapter.PhonePeV1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which bank?");
        String bank = sc.nextLine();
        BankAPI bankAPI;

        if (bank.equalsIgnoreCase("YesBank")) {
            bankAPI = new YesBankAPIAdapter();
        } else {
            bankAPI = new ICICIBankAPIAdapter();
        }
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.rechargeFastTag(50);
        phonePe.availLoan(20);
    }
}
