package course.lesson1;

import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = -100;
        int b = 300;
        if (a+b>=0) {
            System.out.println("Sum is positive");
        }
        else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int min = -300;
        int max = 150;
        int diff = max - min;
        Random rd = new Random();
        int value = rd.nextInt(diff);
        System.out.println(value);
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = -4;
        int b = 0;
        if (a>=b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}


