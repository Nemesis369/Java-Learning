package Project1.src.Students;

import java.util.Scanner;

public class Phd extends Student {
    private String topic;
    private String supervisor;

    @Override
    public void readData(Scanner sc) {
        super.readData(sc);
        System.out.println("Enter topic name: ");
        topic = sc.nextLine();
        System.out.println("Enter supervisor name: ");
        supervisor = sc.nextLine();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Topic: " + topic);
        System.out.println("Supervisor: " + supervisor);
    }
}
