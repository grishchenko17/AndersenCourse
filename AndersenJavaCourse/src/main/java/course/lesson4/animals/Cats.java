package course.lesson4.animals;

public class Cats extends Animals {

        private int maxRun = 200;
        static int catsCounter;


        public Cats(String name) {
            this.name = name;
            catsCounter++;
            animalsCounter++;
        }
        public static int getCount() {
            return catsCounter;
        }
        @Override
        public void run(int length) {
            if (length >=0 && length <=maxRun)
                System.out.println("Cat " + name + " run the distance " + length + " metres!");
            else System.out.println("Cat " + name + " can't run that long!");
        }
        @Override
        public void swim(int length) {
            System.out.println("Cat can't swim!");
        }




    }

