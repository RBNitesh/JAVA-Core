import java.util.*;

// class Number {
    // private int a;
// 
    // Number(int a) {
        // this.a = a;
    // }
// }
// 
// class EvenNumber extends Number {
    // EvenNumber(int a) {
        // super(a);
    // }
// }

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

        // List<EvenNumber> le = new ArrayList<>();
        List<? super Number> ln = new ArrayList<>();
        // this is valid with both upper bound and lower bound
        ln.add(null); // this is valid

        // But, these two is only valid with lower bound
        // ln.add(new Number(5));
        // ln.add(new EvenNumber(5));

        // WildCapture Capture Example
        // helper(le);
    }
    
    // WildCapture Capture Example
    private static void helper(List<?> lst) {
        // lst.set(0, lst.get(0)); // this will give the compile time error
        swapNumber(lst); // this is perfectly fine
    }

    private static <T> void swapNumber(List<T> lst) {
        lst.set(0, lst.get(0));
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
