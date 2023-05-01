package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        float fruitWeight = 0;
        if (fruits.isEmpty()) {
            return fruitWeight;
        } else {
            return fruits.get(0).getWeight() * fruits.size();
        }
    }

    public boolean compare(Box<?> fruitBox) {
        return fruitBox.getWeight() == getWeight();
    }

    public void merge(Box<T> fruitBox) {
        fruits.addAll(fruitBox.fruits);
        fruitBox.fruits.clear();
    }
}
