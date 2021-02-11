package com.company;

public class User {

    String name;
    short age;
    int height;


// Write your code here
    public User (String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height =  height;

    }

    public User (String name, int height, short age){
        this.name = name;
        this.age = age;
        this.height =  height;

    }

    public User (int height, short age, String name){
        this.name = name;
        this.age = age;
        this.height =  height;

    }

    public User (int height, String name, short age){
        this.name = name;
        this.age = age;
        this.height =  height;

    }

    public User (short age, int height, String name){
        this.name = name;
        this.age = age;
        this.height =  height;

    }

    public User (short age, String name, int height){
        this.name = name;
        this.age = age;
        this.height =  height;

    }
    public static void main(String[] args) {
        User user1 = new User("Julie", (short) 22,170);
        User user2 = new User("Jenny", (short) 28, 160);
        User user3 = new User (22, (short) 151, "Christy");



        System.out.println(user1.name + " " + user1.height + " " + user1.age );

    }
}
