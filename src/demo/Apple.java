package demo;

import java.util.WeakHashMap;

public class Apple extends Fruit {
    private static final float WEIGHT = 1.0F;

    @Override
    public float getWeight() {
        return WEIGHT;
    }
}
