import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4);
        System.out.println(sumOf(li));
        List<Double> ld = Arrays.asList(1.2, 1.3, 1.4, 1.5);
        System.out.println(sumOf(ld));
    }
    
    // Upper Bounded WildCards
    public static double sumOf(List<? extends Number> lst) {
        double sum = 0;
        for (Number it : lst) {
            sum += it.doubleValue();
        }
        return sum;
    }
}
