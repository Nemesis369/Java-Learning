package AutoBoxingChallenge.src;

import AutoBoxingChallenge.lib.*;

public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("Chase");
        bank.addCustomer("ak", 1000d);
        System.out.println(bank);

        bank.findCustomer("a");

        bank.addTransaction("ak", 200d);
    }
}
