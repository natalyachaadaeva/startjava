package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "M";
    String name = "Иван";
    float height = 80f;
    float weight = 80f;
    int age = 34;

    void move() {
        System.out.print("Идет");
    }

    void run() {
        System.out.print("Бежит");
    }

    String speak() {
        System.out.print("Говорит");
        return "";
    }

    void learnJava() {
        System.out.print("Учит Java");
    }
}