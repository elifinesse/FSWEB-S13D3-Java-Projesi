package com.workintech.be1d3;

public class Main {
    public static void main(String[] args) {

        new Person();
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());
    }
}