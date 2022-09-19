package course.lesson2;

public class Methods {
    public static void main(String[] args) {
        System.out.println(between10and20(6, 19));
        posOrNegNum(-6);
        System.out.println(ifNumIsTrue(-6));
        printString("Robert ", 6);
        System.out.println(leapYear(2024));
        System.out.println(leapYear(2023));


    }

    public static boolean between10and20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void posOrNegNum(int a) {
        if (a >= 0) System.out.println("Number " + a + " is positive");
        else System.out.println("Number " + a + " is negative");

    }

    public static boolean ifNumIsTrue(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void printString(String name, int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println("My name is " + name);
        }

    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);





    }

}














