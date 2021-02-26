package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        // prints all the lines
           Scanner scan = new Scanner("On a withered branch\n" +
                    "A crow has alighted.\n" +
                    "Nightfall in autumn.\n\n***" +
                    " \n" +
                    " \n" +
                    "Such a moon above,\n" +
                    "Like a tree cut at the root:\n" +
                    "The fresh cut is white.\n\n***" +
                    " \n" +
                    " \n" +
                    "How the river floods!\n" +
                    "A heron wanders on short legs,\n" +
                    "Knee-deep in the water.");

        scan.useDelimiter("\n/*/*/*");

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        scan.close();


        // check if character is a number
            /*Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number: ");

            if (scanner.hasNextInt()) {
                int s = scanner.nextInt();
                System.out.println("Your number is: " + s);
            }else {
                System.out.println("Please provide number");
            }*/

        // prints all the lines
            /*Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
                    "How charged with punishments the scroll,\n" +
                    "I am the master of my fate,\n" +
                    "I am the captain of my soul");
            String s = scanner.nextLine();
            System.out.println(s);
            s = scanner.nextLine();
            System.out.println(s);
            s = scanner.nextLine();
            System.out.println(s);
            s = scanner.nextLine();
            System.out.println(s);*/

        // Output has only first line
          /*  Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
                    "How charged with punishments the scroll,\n" +
                    "I am the master of my fate,\n" +
                    "I am the captain of my soul");
            String s = scanner.nextLine();
            System.out.println(s);*/
    }
}