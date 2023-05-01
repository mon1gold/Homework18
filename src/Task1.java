import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {12,33123,123,13,4};
        System.out.println(toList(array));
    }
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>(array.length);
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
