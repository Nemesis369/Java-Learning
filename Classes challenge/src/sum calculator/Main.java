public class Main {
    public static int add(int a, int b) {
        while (b != 0) {
            // Calculate the carry bits
            int carry = a & b;
            
            // Perform addition without carrying
            a = a ^ b;
            
            // Shift the carry bits to the left
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 27;
        int result = add(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }
}