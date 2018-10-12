package com.company;

public class Lesson11 {
    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Viorica");
    sb.delete(3,7);

    System.out.println(sb);

    StringBuilder sb3 = new StringBuilder("Viorica");
    StringBuilder sb2 = new StringBuilder("Daud");

        System.out.println(sb3 ==sb2);//false
        System.out.println(sb3.toString().equals(sb2.toString()));//false

        System.out.println(sb3);
        System.out.println(sb2);


   }
    }


