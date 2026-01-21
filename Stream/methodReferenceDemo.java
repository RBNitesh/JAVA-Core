import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class methodReferenceDemo {
    public static void main(String[] args) {
        Integer[] a = { 5, 4, 3, 2, 1 };
        Arrays.sort(a, Integer::compare);

        Stream<Integer> stream = Arrays.stream(a);
        for (Integer it : stream.toList()) {
            System.out.println(it);
        }
    }
}