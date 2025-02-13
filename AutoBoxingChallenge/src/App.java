package AutoBoxingChallenge.src;

import AutoBoxingChallenge.lib.*;

public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("Chase");
        bank.addCustomer("ak", 1000d);
        System.out.println(bank);

        bank.addTransaction("ak", -50.43d);
        bank.addTransaction("ak", -10.40d);
        bank.printStatement("ak");

        bank.addCustomer("Bob", 25);
        bank.addTransaction("Bob", 1000);
        bank.printStatement("Bob");
    }
}
