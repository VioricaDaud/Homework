package com.company.Tekwiil;

import com.company.Animal;

public class Student {
    public String name;
    public int age;
    public double height;
    public Animal animalDeCompanie;

    public void printDetails() {
        printAge();
        printName();

    }
    void printName() {
        System.out.println("My name is " + name);
    }

    void printAge() {
        System.out.println("Age " + age);
    }

}
