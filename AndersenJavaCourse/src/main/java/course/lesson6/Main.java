package course.lesson6;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String [][] {
                {"1", "2", "3", "4"},
                {"hello", "0", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},

        };
        try {

            try {
                int result = Arrays.passArray(array);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Wrong array size!");
            }

        } catch (MyArrayDataException e) {
            System.out.println("Wrong array! Mistake in a sell: " + e.i + " x " + e.j);

        }
    }
}

