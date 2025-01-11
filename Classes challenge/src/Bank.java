// public class Bank {
//     private int accNum;
//     private double accBal = 0;
//     private String customerName;
//     private String email;
//     private long phNo;

//     // constructor
//     public Bank() {
//         // constructor chaining
//         this(56789, 2.50, "Default Name", "Default Address", 987654321L);
//         System.out.println("Empty constructor called");
//     }
//     public Bank(int accNum, double accBal, String customerName, String email, long phNo) {
//         System.out.println("Bank constructor with parameters is called");
//         this.accNum = accNum;
//         this.accBal = accBal;
//         this.customerName = customerName;
//         this.email = email;
//         this.phNo = phNo;
//     }
//     public Bank(String customerName, String email, long phNo) {
//         this(99999, 100.55, customerName, email, phNo);
//         // this.customerName = customerName;
//         // this.email = email;
//         // this.phNo = phNo;
//     }

//     // setter
//     public void setAccNum(int accNum) {
//         this.accNum = accNum;
//     }
//     public void setBal(double accBal) {
//         this.accBal = accBal;
//     }
//     public void setCusName(String customerName) {
//         this.customerName = customerName;
//     }
//     public void setEmail(String email) {
//         this.email = email;
//     }
//     public void setPhone(long num) {
//         this.phNo = num;
//     }

//     // getter
//     public int getAccNum() {
//         return this.accNum;
//     }
//     public double getBal() {
//         return this.accBal;
//     }
//     public String getName() {
//         return this.customerName;
//     }
//     public String getEmail() {
//         return this.email;
//     }
//     public long getPhone() {
//         return this.phNo;
//     }

//     // depositing in acc
//     public void depo(int depBal) {
//         accBal += depBal;
//         System.out.println("Amount : " + depBal + " deposited into your account.");
//         System.out.println("New balance is : " + this.accBal);
//     }

//     // withdrawing from acc
//     public void withdraw(int withBal) {
//         if(withBal > this.accBal) {
//             System.out.println("Not sufficient funds");
//             return;
//         }
//         accBal -= withBal;
//         System.out.println("Amount : " + withBal + " withdrew successfully from account");
//         System.out.println("New balance is : " + this.accBal);
//     }
// }