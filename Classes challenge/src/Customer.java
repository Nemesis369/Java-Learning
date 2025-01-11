public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    //constructor
    public Customer() {
        this("Default name", 100.00, "Default email");
    }
    public Customer(String name, String email) {
        this(name, 100.00, email);
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // getters
    public String getName() {
        return this.name;
    }
    public double getCredLimit() {
        return this.creditLimit;
    }
    public String getEmail() {
        return this.email;
    }
}