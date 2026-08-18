import java.util.function.*;

public class lambdaDemo {
    public static void main(String[] args) {
        System.out.println("Namaste, Everyone!");

        // Consumer
        Consumer<String> printer = s -> System.out.println("Message: " + s);
        System.out.println("\n=== Consumer Examples ===");
        printer.accept("Hello Lambda!");
        printer.accept("This is fun!");

        // Supplier
        Supplier<String> greeting = () -> "Welcome to Java!";
        System.out.println("\n=== Supplier Examples ===");
        System.out.println(greeting.get());
        System.out.println(greeting.get());

        // Predicate
        Predicate<String> hasThreeChars = s -> s.length() == 3;
        System.out.println("=== Predicate Examples ===");
        System.out.println("'cat' has 3 chars: " + hasThreeChars.test("cat"));
        System.out.println("'dog' has 3 chars: " + hasThreeChars.test("dog"));
        System.out.println("'elephant' has 3 chars: " + hasThreeChars.test("elephant"));

        // Function
        Function<String, Integer> getLength = s -> s.length();
        System.out.println("\n=== Function Examples ===");
        System.out.println("Length of 'Java': " + getLength.apply("Java"));
        System.out.println("Length of 'Programming': " + getLength.apply("Programming"));

        // Your turn
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("\n=== Your Turn ===");
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));
    }
}
