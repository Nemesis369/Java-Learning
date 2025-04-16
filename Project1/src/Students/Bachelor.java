package Project1.src.Students;

import java.util.Scanner;

public class Bachelor extends Student {
    private String branch;
    private String college;

    @Override
    public void readData(Scanner sc) {
        super.readData(sc);
        System.out.println("Enter branch: ");
        branch = sc.nextLine();
        System.out.println("Enter college name: ");
        college = sc.nextLine();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Branch: " + branch);
        System.out.println("College: " + college);
    }
}
