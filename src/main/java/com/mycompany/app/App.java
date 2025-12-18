package com.example;

public class App {
    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Sum: " + app.add(2, 3));
        System.out.println("Is 4 even? " + app.isEven(4));
    }
}
