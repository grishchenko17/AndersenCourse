package course.lesson4.animals;

public class Dogs extends Animals{

    private int maxRun = 500;
    private int maxSwim = 10;
    private static int dogCounter;

    public static int getCount() {
        return dogCounter;
    }



    public Dogs(String name) {
        this.name = name;
        dogCounter++;
        animalsCounter++;
    }

    @Override
    public void run(int length) {
        if (length >=0 && length <=maxRun)
            System.out.println("Dog " + name + " run a distance of " + maxRun + " metres!");
        else System.out.println("Dog " + name + " can't run such a long distance!");
    }


    @Override
    public void swim(int length) {
        if (length >=0 && length <=maxSwim)
            System.out.println("Dog " + name + " swim a distance of " + maxSwim + " metres!");
        else System.out.println("Dog " + name + " can't swim such a long distance!");
    }
}

