package com.company;
import java.io.*;

public class TimeMachine {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = input.readLine();
            if (s.equals("exit"))
                break;
        }
    }
}