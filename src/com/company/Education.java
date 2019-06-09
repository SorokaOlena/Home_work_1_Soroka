package com.company;


public class Education {
    //Task4 (Fix the program to get the correct result)
    public static int a = 5;
    public static int b = 10;
    public static double c = a;
    public static double d = b;

    public static void main(String[] args) {

        System.out.println("Task 4:");
        double result = c / d;
        System.out.println(result);
    }
}



/*
//Task5 ( Change the operations  to get the result 20)
public class Education {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {
        System.out.println("Task 5:");
        int result=-a+b-c+d;
        System.out.println(result);
    }
       }
*/

/*
//Task 7 (Comment variables which are never used)
public class Education {
    public static void main(String[] args) {
        System.out.println("Task 7:");
        int a = 10;
        int b = 15;
        double c = b + 38;
    //    int d = a + 12;
    //    double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
    //    String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c );
        System.out.println( s4 );
        System.out.println( s);
    }
    }
*/