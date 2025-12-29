import java.security.KeyStore.Entry;
import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> lmp = new LinkedHashMap();

        lmp.put("Nitesh", 1);
        lmp.put("Mithun", 2);
        lmp.put("Praveen", 3);
        lmp.put("Amresh", 4);
        lmp.put("Arvind", 5);
        lmp.put("Ajeet", 6);

        for (Map.Entry<String, Integer> entry : lmp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}