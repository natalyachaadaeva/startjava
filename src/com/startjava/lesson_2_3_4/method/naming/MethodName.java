package com.startjava.lesson_2_3_4.method;

public class MethodName {
    public static String getCurrent() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}