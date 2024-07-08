package edu.sdccd.cisc191.template;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, welcome to a tracker for student's grades! Please enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Now enter the number of columns you wish to have: ");
        int col = sc.nextInt();


        //declaring new studentArray of type StudentArray
        StudentArray studentArray = new StudentArray(row, col);

        while (true) {
            System.out.println("Here is the menu: ");
            System.out.println("1. Get student data at index:");
            System.out.println("2. Insert student data at index:");
            System.out.println("3. Find student data at index:");
            System.out.println("4. Print all student data:");
            System.out.println("5. Delete student at index:");
            System.out.println("6. Expand your student array:");
            System.out.println("7. Shrink your student array:");
            System.out.println("8. Exit!");
            System.out.print("Enter the numbered choice: ");
            int choice = sc.nextInt();

            //switch statement for all of the different choices in the menu
            switch (choice) {
                case 1:
                    System.out.print("Enter the row: ");
                    row = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the column: ");
                    col = sc.nextInt();
                    Student student = studentArray.getAtIndex(row,col);

                    if (student != null) {
                        System.out.println("Student Name: " + student.getFullName() + "\n Student Age: " + student.getAge() + "\n Student Test Grade: " + student.getTestGrade());
                    } else {
                        System.out.println("No student data found at this index.");
                    }
                    break;
                case 2:

                    System.out.println("Enter the row: ");
                    row = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the column: ");
                    col = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the student name: ");
                    String fullName = sc.nextLine();

                    System.out.println("Enter the student age: ");
                    int age = sc.nextInt();

                    System.out.println("Enter the test grade: ");
                    int testGrade = sc.nextInt();

                    //setting new index
                    studentArray.setAtIndex(row,col, new Student(fullName, age, testGrade));
                    break;

                case 3:
                            System.out.println("Enter the student name: \n");
                            String studentName = sc.nextLine();
                            int[] index = studentArray.findIndexOf(studentName);
                            if (index != null) {
                                System.out.println("Found at index: ");
                            } else {
                                System.out.println("No student data found at this index.");
                            }

                            break;
                case 4:

                    studentArray.print();
                    break;

                case 5:
                                    System.out.println("Enter row:");
                                    row = sc.nextInt();
                                    System.out.println("Enter column:");
                                    col = sc.nextInt();
                                    studentArray.deleteAtIndex(row,col);
                                    break;

                case 6:
                    System.out.println("Enter new number of rows and columns:");
                    int rows = sc.nextInt();
                    int cols = sc.nextInt();
                    studentArray.expandArr(rows,cols);
                    break;

                case 7: System.out.println("Enter new number of rows and columns:");
                    rows = sc.nextInt();
                    cols = sc.nextInt();
                    studentArray.shrinkArr(rows,cols);
                    break;

                case 8:
                    System.out.println("You are exiting the system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");

            }

        }
    }

}
