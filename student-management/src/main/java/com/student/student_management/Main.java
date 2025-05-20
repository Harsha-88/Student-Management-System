package com.student.student_management;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Enrollment Number: ");
                    String enroll = scanner.nextLine();



                    Student s = new Student(id, name, enroll);
                    manager.addStudent(s);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.print("Enter ID of student to remove: ");
                    int removeId = scanner.nextInt();
                    boolean removed = manager.removeStudent(removeId);
                    if (removed) {
                        System.out.println("Student removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    List<Student> all = manager.getAllStudents();
                    if (all.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Student stu : all) {
                            System.out.println(stu);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Bye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

