package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Tom", 2f, 5f, 1);
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setHeight(260f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setArmor(6);
        System.out.println("ModelName JaegerOne = " + jaegerOne.getModelName() +
                "\nHeight JaegerOne = " + jaegerOne.getHeight() + "\nWeight JaegerOne = " +
                jaegerOne.getWeight() + "\nArmor JaegerOne = " + jaegerOne.getArmor());

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", 250f, 1.722f, 6);
        System.out.println("\nModelName JaegerTwo = " + jaegerTwo.getModelName() +
                "\nHeight JaegerTwo = " + jaegerTwo.getHeight() + "\nWeight JaegerTwo = " +
                jaegerTwo.getWeight() + "\nArmor JaegerTwo = " + jaegerTwo.getArmor());
    }

}