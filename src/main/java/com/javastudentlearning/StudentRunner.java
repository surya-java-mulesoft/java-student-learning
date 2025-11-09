package com.javastudentlearning;
public class StudentRunner {
    
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Simma";
        student1.lastName = "Devi";
        student1.marks = 45;
        student1.fullName(student1.firstName, student1.lastName);
        System.out.println("Is Passed: " + student1.getIsPassed(student1.marks));

        Student student2 = new Student();
        student2.firstName = "Simma";
        student2.lastName = "Shiva";
        student2.marks = 35;
        student2.fullName(student2.firstName, student2.lastName);
        System.out.println("Is Passed: " + student2.getIsPassed(student2.marks));

        Student student3 = new Student("S003", "Menda", "Surya Mohan Rao", "skldjfhklsdh@gmail.com", 75);
        student3.fullName(student3.firstName, student3.lastName);
        System.out.println("Is Passed: " + student3.getIsPassed(student3.marks));   
    }
}
