package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String name = reader.readLine();
            // long version
            String sNumber1 = reader.readLine();
            int aNumber1 = Integer.parseInt(sNumber1);

            // same as above but shorter
            int number2 = Integer.parseInt(reader.readLine());

            System.out.println(name + " will receive " + aNumber1 + " in " +  number2 + " years.");

        }
}
