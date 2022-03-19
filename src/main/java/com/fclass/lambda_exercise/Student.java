package com.fclass.lambda_exercise;

public class Student {
    private String firstName;
    private String lastName;
    private int roll;

    public Student(String firstName, String lastName, int roll) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.roll = roll;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roll=" + roll +
                '}';
    }
}
