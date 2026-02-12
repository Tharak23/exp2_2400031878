package com.klu.hibernateproject;

public class App {
    public static void main(String[] args) {
        String user = args.length > 0 ? args[0] : "World";
        System.out.println("Hello " + user + "!");
    }
}
