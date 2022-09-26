package course.lesson4.catsArray;


public class Execution {

    public static void main(String[] args) {

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Barsik", 5, false);
        catArray[1] = new Cat("Bobik", 10, false);
        catArray[2] = new Cat("Villey", 20, false);
        catArray[3] = new Cat("Polly", 21, false);
        catArray[4] = new Cat("Zhuchok", 7, false);

        Plate plate1 = new Plate(30);
        plate1.info();
        for (int i = 0; i< catArray.length; i++) {
            if (plate1.food > catArray[i].appetite){
            catArray[i].eat(plate1);
            catArray[i].satiety = true;
        }
        }
        for (int i = 0; i< catArray.length; i++){
            System.out.println(catArray[i].satiety);
        }
        plate1.info();
        Plate plate2 = new Plate(0);
        plate2.increaseFood(plate1.food);
        plate2.info();
    }

}



