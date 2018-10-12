package com.company;

import com.company.Tekwiil.Student;

public class Calculator {

    double[] calculeazaDescriminant( double a, double b, double c) {

        double[] solutie = new double[2];


        double descriminant = (b * b) - 4 * a * c;
        System.out.println(descriminant);

        if (descriminant > 0) {
            solutie[0] = ((-b + Math.sqrt(descriminant)) / (2 * a));
            solutie[1] = ((-b - Math.sqrt(descriminant)) / (2 * a));

        } else {
            if (descriminant == 0) {
                solutie[0] = solutie[1] = -b / (2 * a);
            } else {
                System.out.println("Ecuatia nu are solutii reale");
            }
        }

        return solutie;
    }

    Student createStudent(String name, int age, double height){

        Student studentToBeReturned = new Student();
        studentToBeReturned.name = name;
        studentToBeReturned.age = age;
        studentToBeReturned.height = height;

        return studentToBeReturned;
    }
    // [ "a","b", "c"] , 1
    String getStringFromArray(String[] list, int x){

        if (x<list.length && x>=0){
            return  list[x];
        }else{
            return "NO SOLUTION !!!!";
        }
    }
}
