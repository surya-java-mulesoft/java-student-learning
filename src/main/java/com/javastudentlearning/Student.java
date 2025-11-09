package com.javastudentlearning;

public final class Student {
     String id;
     String firstName;
     String lastName;
     String email;
     int marks;
     Boolean isPassed;

    Student(String id, String firstName, String lastName, String email, int marks)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.marks = marks;
    }

    Student()
    {
        
    }

    public Boolean getIsPassed(int marks) 
    {
        if(marks >= 40)
        {
            isPassed = true;
        }
        else
        {
            isPassed = false;
        }
        return isPassed;
    }  

    public void fullName(String firstName, String lastName)
    {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

}