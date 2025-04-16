package Project1.src.Students;

import java.util.Scanner;

public class Scientist extends Student {
    private String area;

    @Override
    public void readData(Scanner sc) {
        super.readData(sc);
        System.out.println("Enter area of subject: ");
        area = sc.nextLine();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Area: " + area);
    }
}
