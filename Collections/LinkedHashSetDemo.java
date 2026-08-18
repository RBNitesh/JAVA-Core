import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Collection<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(i + i * i - i);
        }

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}