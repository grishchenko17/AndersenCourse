package course.lesson5;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Task 1 - 1 variant
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Array before changing:" + Arrays.toString(arr2));
        int temp = arr2[0];
        arr2[0] = arr2[3];
        arr2[3] = temp;
        System.out.println("Array after changing first and third element:" + Arrays.toString(arr2));

        //Task 1 - 2 variant
        String[] arr = {"one", "two", "three", "four", "five"};
        System.out.println("Array before changing:" + Arrays.toString(arr));
        Collections.swap(Arrays.asList(arr), 4,0);
        System.out.println("Array after changing first and last element:" + Arrays.toString(arr));


        //Task 2
        Box<Apple> boxWithApples = new Box<>();
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());
        Box<Orange> boxWithOranges = new Box<>();
        boxWithOranges.addFruit(new Orange());
        boxWithOranges.addFruit(new Orange());
        Box<Orange> secondBoxWithOranges = new Box<>();
        System.out.println("Weight of box with apples = " + boxWithApples.getWeight());
        System.out.println("Weight of box with oranges = " + boxWithOranges.getWeight());
        System.out.println("Weight of new box with oranges = " + secondBoxWithOranges.getWeight());
        System.out.println("Replace fruits: ");

        boxWithOranges.replaceFruits(secondBoxWithOranges);
        System.out.println("Weight of first box with oranges = " + boxWithOranges.getWeight());
        System.out.println("Weight of new box with oranges = " + secondBoxWithOranges.getWeight());

        System.out.println("Compare boxes with fruits: ");
        System.out.println("Box with apples compare with first box of oranges: " + boxWithApples.compareBoxes(boxWithOranges));
        System.out.println("Box with apples compare with second box of oranges: " + boxWithApples.compareBoxes(secondBoxWithOranges));





    }

}
