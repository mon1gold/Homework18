package demo;

public class Main {
    public static void main(String[] args) {
        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();
        Box<Apple> appleBox = new Box<>();
        apples.add(new Apple(), new Apple(), new Apple());
        oranges.add(new Orange(), new Orange(),new Orange());
        appleBox.add(new Apple(), new Apple(), new Apple());
        System.out.println(apples.getWeight());
        System.out.println(oranges.getWeight());
        System.out.println(apples.compare(oranges));
        System.out.println(appleBox.getWeight());
        apples.merge(appleBox);
        System.out.println();
        System.out.println(apples.getWeight());
        System.out.println(appleBox.getWeight());
    }
}
