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
    }

    // public static <T> T fun(T s, List<T> a) {
    // return s;
    // }

    public static <T> T fun(T s, T a) {
        return a;
    }
}



