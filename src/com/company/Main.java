package com.company;

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        cat.swim();
        dog.play();
        cat.play();

    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal implements Swimmer, Player {
}

class Dog extends Animal {
    //Override the swim() and the play() methods
    public void swim() {
        System.out.println("Dog is swimming");
    }

    public void play() {
        System.out.println("Dog is playing");
    }

}

class Cat extends Animal {
    //Override the swim() and the play() methods
    public void swim() {
        System.out.println("Cat is swimming");
    }

    public void play() {
        System.out.println("Cat is playing");
    }

}