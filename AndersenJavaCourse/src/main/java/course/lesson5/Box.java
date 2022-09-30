package course.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit>  {
        ArrayList<T> list = new ArrayList<>();

        public Box(T... fruit) {
                list = new ArrayList<>(Arrays.asList(fruit));

        }
        public void addFruit(T fruit) {
                list.add(fruit);
        }

        public float getWeight() {
                float defaultWeight = 0.0f;
                for (int i = 0; i < list.size(); i++) {
                        defaultWeight = defaultWeight + list.get(i).getWeight();
                }
                        return defaultWeight;


        }
        public boolean compareBoxes(Box<? extends Fruit> newBox) {
                return Math.abs(getWeight() - newBox.getWeight()) < 0.0001f;

        }

        public void replaceFruits(Box<T> anotherBox) {
                anotherBox.list.addAll(this.list);
                        list.clear();
                }
        }


















