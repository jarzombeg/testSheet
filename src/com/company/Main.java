package com.company;

public class Main {
    private static String TEXT = "The end.";

    public static void main(String[] args) {
        //write your code here
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = new Woman();
        dog.owner = new Woman();
        fish.owner = new Woman();

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}