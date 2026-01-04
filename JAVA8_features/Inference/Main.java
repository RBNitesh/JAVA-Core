import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Namasakar!");

        // int[] arr = { 1, 3, 4, 5 };
        // String str = "23456";
        // System.out.println(fun(str, arr).getClass());

        // Integer I = Main.<Integer>fun(10, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        // System.out.println(I);

    
        // MyClass<Integer> obj = new MyClass<>("");

        List<Integer> li = Arrays.asList(1, 2, 3, 4);
        System.out.println(sumOf(li));

        List<Double> ld = Arrays.asList(1.2, 1.3, 1.4, 1.5);
        System.out.println(sumOf(ld));
    }

    // public static <T> T fun(T s, List<T> a) {
    // return s;
    // }

    public static <T> T fun(T s, T a) {
        return a;
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



