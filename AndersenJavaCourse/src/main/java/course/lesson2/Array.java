package course.lesson2;

import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
        changeArray();
        fillArray();
        multipleArray();
        fillDiagonal();
        printArray(6,6);
       // shiftArray(1);

    }


    public static void changeArray() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Before changing: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        System.out.println("\nAfter changing: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }


    public static void fillArray() {
        int[] arrayFirst = new int[100];
        System.out.println("\nFill the array from 1 to 100: ");
        for (int i = 0; i < arrayFirst.length; i++ ) {
            arrayFirst[i] = i+1;
        }
            System.out.println(Arrays.toString(arrayFirst));

        }

    public static void multipleArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nMultiply all numbers less than 6 by 2: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
            else ;
        }
            System.out.println(Arrays.toString(array));

    }


    public static void fillDiagonal() {

        int[][] arr = new int [5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j) {
                    arr[i][j] = 1;
                }
                else if (i+j == arr.length - 1 ) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);

            }
            System.out.println();
            }

            }


            public static void printArray(int len, int initialValue) {
        int[] arr2= new int[len];
        for (int i = 0; i< len; i++) {
            arr2[i] = initialValue;

        }
                System.out.print(Arrays.toString(arr2));

                System.out.println();
            }

//            public static void shiftArray (int n) {
//            int[] arr3 = {1,2,3,4,5,6,7};
//                System.out.println(Arrays.toString(arr3));
//            for (int i = 0; i < arr3.length-1; i++) {
//                    arr3[i] =arr3[i+n];
//                System.out.println(Arrays.toString(arr3));
//                }



}










