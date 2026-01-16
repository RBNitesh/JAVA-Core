import java.util.*;
import java.util.function.*;

public class Main{
    public static void main(String[] args) {
        Supplier supplier = () -> "Namaste!";
        System.out.println(supplier.get());

        Consumer<Integer> consumer = (Integer a) -> System.out.println(a);
        consumer.accept(5);

        List<Integer> numbers = Arrays.asList( 1, 2, 3, 4);
        numbers.forEach(consumer);

        for (int i = 0; i < 10; i++)
            System.out.println(supplier.get());
    }
}