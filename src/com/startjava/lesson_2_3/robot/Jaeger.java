package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName = "Striker Eureka";
    private float height = 2.3f;
    private float weight = 5.5f;
    private int armor = 9;

    public Jaeger(String modelName, float height, float weight, int armor) {
        this.modelName = modelName;
        this.height = height;
        this.weight = weight;
        this.armor = armor;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public boolean drift() {
        System.out.print("Вы вошли в дрифт");
        return true;
    }
}