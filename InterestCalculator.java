
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Float principalamount = Float.valueOf(0);
        Float rateOfInterest = Float.valueOf(0);
        int numberOfYears = 0;

        try {
            Scanner sc = new Scanner(System.in);
            String tempString;
            System.out.println("Enter principal amount: ");
            System.out.flush();
            tempString = sc.nextLine();
            principalamount = Float.valueOf(tempString);
            System.out.println("Enter rate of interest: ");
            System.out.flush();
            tempString = sc.nextLine();
            rateOfInterest = Float.valueOf(tempString);
            System.out.println("Enter number of years: ");
            System.out.flush();
            tempString = sc.nextLine();
            numberOfYears = Integer.parseInt(tempString);
            throw new IncompatibleClassChangeError
        } catch (Exception e) {}
        float interestTotal = principalamount * rateOfInterest * numberOfYears;
        System.out.println("Total interest: " + interestTotal);
    }
}