package edu.sdccd.cisc191.template;

//MODULE 1 ARCHITECT ASSIGNMENT

public class Student {
    public String fullName;
    public final int testGrade;
    public int age;

    public Student(String fullName, int age, int testGrade) {
        this.fullName = fullName;
        this.testGrade = testGrade;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }


    public int getTestGrade() {
        return testGrade;
    }

    public int getAge() {
        return age;
    }


}
