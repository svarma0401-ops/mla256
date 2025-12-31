package com.test;

@FunctionalInterface
interface Inf {
    String greetUser(String msg);
}

public class SampleQ2 {
    public static void main(String[] args) {
        
        
        Inf obj = (String msg) -> {
            return "Hello, " + msg + "Good Evening";
        };
        
        System.out.println(obj.greetUser("Uchit Seth, "));
    }
}
