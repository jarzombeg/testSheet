package com.company;


public class Main {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        int m;
        if (a <= b && a < c && a <= d)
            m = a;
        else if (b <= a && b <= c && b <= d)
            m = b;
        else if (c <= a && c <= b && c <= d)
            m = c;
        else m = d;
        return m;


    }

    public static int min(int a, int b) {
        //write your code here
        int n;
        if (a <= b)
            n = a;
        else n = b;
        return n;


    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));

    }
}


    /*public static int min(int a, int b, int c) {
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

}*/




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