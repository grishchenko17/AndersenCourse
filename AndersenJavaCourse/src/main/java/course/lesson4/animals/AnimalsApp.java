package course.lesson4.animals;


public class AnimalsApp {
    public static void main(String[] args) {
        Cats cat = new Cats("Barsik");
        cat.run(900);
        cat.swim(7);

        Cats cat2 = new Cats("Bobik");
        cat2.run(60);
        cat2.swim(0);

        Cats cat3 = new Cats("Pupsik");
        cat3.run(60);
        cat3.swim(0);

        Dogs dog = new Dogs("Rex");
        dog.run(500);
        dog.swim(10);

        System.out.println("Amount of animals: " + Animals.getCount());
        System.out.println("Amount of cats: " + Cats.getCount());
        System.out.println("Amount of dogs: " + Dogs.getCount());
    }


}
