package com.company;

public class Cat {

    String name;
    int age;

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void jump() {
        System.out.println("Pounce!");
    }

    public static void main(String[] args) {
        Cat smudge = new Cat();
        smudge.age = 3;
        smudge.name = "Smudge";

        smudge.sayMeow();
        smudge.jump();

    }
}
/*
public class Cat {

    String name;
    int age;
    static int count = 0;

    //My variation
    */
/*static int totalAge = 0;*//*


    public static void main(String[] args) {
        Cat smudge = new Cat();
        smudge.age = 3;
        smudge.name = "Smudge";
        count++;

        Cat fluffy = new Cat();
        fluffy.age = 5;
        fluffy.name = "Fluffy";
        count++;

        */
/*totalAge = smudge.age + fluffy.age;*//*



        System.out.println("We created a cat named " + smudge.name + ". His age is " + smudge.age);
        System.out.println("We created a cat named " + fluffy.name + ". His age is " + fluffy.age);

        System.out.println("Total number of cats = " + count);
        */
/*System.out.println("Total age of cats = " + totalAge);*//*

    }
}*/
