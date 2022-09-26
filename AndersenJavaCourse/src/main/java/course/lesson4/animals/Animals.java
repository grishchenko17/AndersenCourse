package course.lesson4.animals;

    public abstract class Animals {

        String name;
        static int animalsCounter;


        public static int getCount() {
            return animalsCounter;
        }
        abstract public void run(int length);

        abstract public void swim(int length);

    }


