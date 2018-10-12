package com.company;

import com.company.Tekwiil.Student;

public class Lesson8 {
    public static void main(String[] args) {
        Student[ ]students = new Student[3];
        //{null,null,null}

//   System.out.println(students[0].name);

        Student jora=new Student();
        students[0]=jora;
        //{tfg,null,nul}

        System.out.println(students[0].name);

        //Incepe un alt exercitiu !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        Animal[]animals=new Animal[3];
        // {null,null,null}

        Animal one=new Animal();
        one.name="Dog";

        Animal two=new Animal();
        two.name="Cat";

        Animal three=new Animal();
        three.name="Cow";

        animals[0]=one;
        animals[1]=two;
        animals[2]=three;

        int animalCounter = 0;

        for (Animal x:animals){
            if (x.name.startsWith("C")){
                animalCounter++;
            }
        }
        System.out.println(animalCounter);


    }
}
