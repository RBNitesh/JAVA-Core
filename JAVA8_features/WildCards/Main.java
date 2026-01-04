import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4);
        // System.out.println(sumOf1(li));
        // sumOf2(li);
        List<Double> ld = Arrays.asList(1.2, 1.3, 1.4, 1.5);
        // System.out.println(sumOf1(ld));
        // sumOf2(ld);

        System.out.println(sumOf3(li));
        // System.out.println(sumOf3(ld)); // this is not allowed
    }
    
    // Upper Bounded WildCards
    public static double sumOf1(List<? extends Number> lst) {
        double sum = 0;
        for (Number it : lst) {
            sum += it.doubleValue();
        }
        return sum;
    }

    // Unbounded WildCards
    public static void sumOf2(List<?> lst) {
        double sum = 0;
        for (Object o : lst) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    // Lower Bounded WildCards
    public static int sumOf3(List<? super Integer> lst) {
        String s = new String();
        for (Object it : lst) {
            s += it.toString();
        }
        return Integer.valueOf(s);
    }
}
