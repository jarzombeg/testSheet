package com.company;

public class TimeMachine {

        public void goToFuture (Cat cat){
            //cat = new Cat(cat.age);    //uncomment to break it
            cat.age += 10;
        }

        public void goToPast (Cat cat){
            cat = new Cat(cat.age);    //uncomment to break it
            cat.age -= 10;
        }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();

        Cat smudge = new Cat(5);

        System.out.println("How old was Smudge when the program started?");
        System.out.println(smudge.age);

        timeMachine.goToFuture(smudge);
        System.out.println ("Smudge went to the future! Has his age changed?");
        System.out.println(smudge.age);

        System.out.println ("And if you try going back?");
        timeMachine.goToPast(smudge);
        System.out.println(smudge.age);
    }
}
