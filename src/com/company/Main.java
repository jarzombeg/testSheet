package com.company;


public class Main {
     public static int min(int a, int b, int c) {
        //write your code here
        int m;
        if (a <= b && a <= c )
            m = a;
         else if (b <= a && b <= c)
            m = b;
         else m = c;
        return m;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}




       /* public static int min(int a, int b) {
            //write your code here
            int m;

                if (a < b)
                m = a;
                else
                    m = b;
                return m;


            }

        public static void main(String[] args) throws Exception {
            System.out.println(min(12, 33));
            System.out.println(min(-20, 0));
            System.out.println(min(-10, -20));
        }
    }*/