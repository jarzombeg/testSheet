package com.company;

public class TimeMachine {

    public void goToFuture(int currentYear) {

        currentYear = currentYear+10;
    }

    public void goToPast(int currentYear) {

        System.out.println("The goToPast method has started running!");

        System.out.println("currentYear inside the goToPast method (at the beginning) = " + currentYear);
        currentYear = currentYear-10;
        System.out.println("currentYear inside the goToPast method (at the end) = " + currentYear);
    }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2018;

        System.out.println("What was the year when the program started?");
        System.out.println(currentYear);

        timeMachine.goToPast(currentYear);
        System.out.println("And what year is it now?");
        System.out.println(currentYear);
    }
}

/*

public class TimeMachine {


    public void goToFuture(int currentYear) {

        currentYear = currentYear+10;
    }

    public void goToPast(int currentYear) {

        currentYear = currentYear-10;
    }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        int currentYear = 2018;

        System.out.println("What year is it?");
        System.out.println(currentYear);

        timeMachine.goToPast(currentYear);
        System.out.println("How about now?");
        System.out.println(currentYear);
    }
}
*/
