package com.workintech.be1d3;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    String nationality;
    int phoneNum;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        System.out.println("First name: " + firstName);
    }
    public Person(String firstName, String lastName, int age, String gender, String nationality, int phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.phoneNum = phoneNum;
    }
    public Person(){
        this("elif", "sağlam", 29);
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age < 20 && age > 12;
    }
}
