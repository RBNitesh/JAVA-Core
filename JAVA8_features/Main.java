import java.util.ArrayList;
import java.util.Collection;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // Consumer<Integer> print = (i) -> System.out.println(i);

        // Predicate<String> p = (s) -> s.equals("nitesh");

        // for (int i = 0; i < 10; i++) {
            // print.accept(i);
        // }

        // System.out.println(p.test("brajesh"));

        // System.out.println();

        ArrayList<? super B> lst1 = new ArrayList<>();

        lst1.add(new B("Harsha"));
        lst1.add(new C("Ravi"));

        ArrayList<B> lst2 = new ArrayList<>();
        lst2.add(new B("Arvind"));

        lst1.addAll(lst2);
        for (Object o : lst1) {
            A a = (A) o;
            System.out.println(a.name);
        }

    }

    static class A {
        String name;
        public A(String s) {
            this.name = s;
        }
    }

    static class B extends A {
        public B(String s) {
            super(s);
        }
    }

    static class C extends B {
        public C(String name) {
            super(name);
        }
    }
}
