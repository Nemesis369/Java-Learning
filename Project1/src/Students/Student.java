package Project1.src.Students;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private String course;
    private String department;

    // public Student(String name, int rollNo, String course, String department) {
    // this.name = name;
    // this.rollNo = rollNo;
    // this.course = course;
    // this.department = department;
    // }

    public void readData(Scanner sc) {
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No.: ");
        rollNo = sc.nextInt();
        System.out.println("Enter course: ");
        course = sc.nextLine();
        System.out.println("Enter department: ");
        department = sc.nextLine();
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Course: " + course);
    }
}
