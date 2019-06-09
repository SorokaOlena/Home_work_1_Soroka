package com.company;
import java.util.ArrayList;

//Task 6 (Comment redundant strings to get the output "Happy Java Learning")
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 6");
        String s ="Java";
        //        System.out.println("Happy");
        //       System.out.println("Java Learning");
        //        System.out.println("programming");
        System.out.print("Happy Java");
        //        System.out.println("weekend");
        //        System.out.println("s");
        //        System.out.println("Python");
        System.out.print(" ");
        System.out.println("Learning");
    }}



//Task 8 (Write a program which prints "Hello world" to the console using methods transformIntToChar and printList only.)
//робила не сама=)
/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 8");

        int[] i = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
        transformIntToChar(i);

        ArrayList<Character> characters = new ArrayList();
        for (int el = 0; el < i.length; el++)
        {
            characters.add((char) i[el]);
        }

        prinList(characters);
    }

    private static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }
    private static void prinList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}

*/
