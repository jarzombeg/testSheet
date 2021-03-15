package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                try {
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
	        /*
	        1. Еrror: division by zero
	        2. Error: wrong value type
	        */
                    //your code goes here
                    int div = num1 / num2;
                    System.out.println(div);

                } catch (ArithmeticException e) {
                    System.out.println("Error: division by zero");
                } catch (InputMismatchException e) {
                    System.out.println("Error: wrong value type");

                }

            }
        }
