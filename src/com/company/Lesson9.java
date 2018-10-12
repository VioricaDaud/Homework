package com.company;

import com.company.Tekwiil.Student;

public class Lesson9 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
         Student ion = calculator.createStudent("ion", 20, 1.85);
         Student jora = calculator.createStudent("jora", 18, 1.75);
         jora.printDetails();
         ion.printDetails();

         //Incepe un alt exercitiu !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

         Animal dog = new Animal();
         dog.name = "Lucky";

         ion.animalDeCompanie = dog;
         jora.animalDeCompanie = dog;

        System.out.println(ion.animalDeCompanie.name);
        ion.animalDeCompanie.name = "Good boy";
        System.out.println(jora.animalDeCompanie.name);

        ///////////////////////////////////////////////////////////////

        Calculator calculator1 = new Calculator();
        String[] listaMea = {"Jora", "Ion", "Vasile", "Dorin"};
        System.out.println(calculator.getStringFromArray(listaMea, 0));
        System.out.println(calculator.getStringFromArray(listaMea, -10));
        System.out.println(calculator.getStringFromArray(listaMea, 10));
        System.out.println(calculator.getStringFromArray(listaMea, 2));


    }
}

