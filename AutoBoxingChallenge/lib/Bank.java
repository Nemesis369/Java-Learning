package AutoBoxingChallenge.lib;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {

    public Customer(String name, double initialDeposit) {
        this(name, new ArrayList<>(500));
        transactions.add(initialDeposit);
    }
}

public class Bank {
    private String name;
    ArrayList<Customer> customerList = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer findCustomer(String customerName) {
        for (var cus : customerList) {
            if (cus.name().equalsIgnoreCase(customerName)) {
                // System.out.println("Customer: " + customerName + " was found");
                return cus;
            }
        }

        // System.out.println("Customer '" + customerName + "' not found");
        return null;
    }

    public void addCustomer(String customerName, double initialDeposit) {
        if (findCustomer(customerName) == null) {
            customerList.add(new Customer(customerName, initialDeposit));
            System.out.println("Customer added successfully");
        } else {
            System.out.println("Customer already exists");
        }
    }

    public void addTransaction(String customerName, double amount) {
        Customer temp = findCustomer(customerName);
        if (temp == null) {
            return;
        }
        temp.transactions().add(amount);
    }

    public void printStatement(String customer) {
        Customer temp = findCustomer(customer);

        if (temp != null) {
            System.out.println("-".repeat(30));
            System.out.println("Customer name: " + temp.name().toUpperCase());
            System.out.println("Transactions:");
            for (double d : temp.transactions()) {
                System.out.printf("%10.2f (%s)\n", d, d > 0 ? "credit" : "debit");
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customerList +
                '}';
    }
}
