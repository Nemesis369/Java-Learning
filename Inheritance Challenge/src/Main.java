public class Main {
    
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(Joe);
        System.out.println("Joe's Paycheck = " + Joe.collectPay());
        Joe.retire();
        System.out.println("Joe's Pension check = $" + Joe.collectPay());
        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
