package Project1.src.Students;

import java.util.Scanner;

public class Master extends Student {
    private String specialization;
    private String project;

    @Override
    public void readData(Scanner sc) {
        super.readData(sc);
        System.out.println("Enter specialization: ");
        specialization = sc.nextLine();
        System.out.println("Enter project: ");
        project = sc.nextLine();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Specialization: " + specialization);
        System.out.println("Project: " + project);
    }
}
