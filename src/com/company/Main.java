package com.company;

public class Main {
    private static String TEXT = "The end.";

    public static void main(String[] args) {
        System.out.println("Hi");
        String s = "Hi!";

        System.out.println(s);
        if (args != null) {
            String s2 = s;

            System.out.println(s2);

        }
        Main main = new Main();
        System.out.println(TEXT);

    }

    public String instanceVariable;

    public Main() {
        instanceVariable = "Instance variable test.";
    }
}