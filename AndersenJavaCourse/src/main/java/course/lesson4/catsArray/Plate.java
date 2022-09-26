package course.lesson4.catsArray;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;

    }
    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int k) {
        food += k;

    }

    public void info() {
        System.out.println("Food in a plate: " + food);
    }

}
