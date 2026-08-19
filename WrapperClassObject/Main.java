package WrapperClassObject;

/**
 * Main.java
 *
 * Demonstrates Java Wrapper Classes:
 * 1. Autoboxing and Unboxing (Implicit vs. Explicit)
 * 2. Integer decoding (Hexadecimal, Octal, Decimal strings)
 * 3. Parsing and Value conversion methods
 * 4. Base conversions (Binary, Octal, Hexadecimal)
 * 5. Utility methods & Constants (Integer, Character, Double)
 * 6. Integer Cache behavior (-128 to 127)
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1. AUTOBOXING & UNBOXING ===");
        demonstrateAutoboxingAndUnboxing();

        System.out.println("\n=== 2. DECODE METHOD (Hex, Octal, Decimal) ===");
        demonstrateDecodeMethod();

        System.out.println("\n=== 3. PARSING & VALUE CONVERSION METHODS ===");
        demonstrateParsingAndValueOf();

        System.out.println("\n=== 4. BASE CONVERSIONS (Binary, Octal, Hex) ===");
        demonstrateBaseConversions();

        System.out.println("\n=== 5. COMMON UTILITY METHODS & CONSTANTS ===");
        demonstrateUtilityMethods();

        System.out.println("\n=== 6. WRAPPER OBJECT CACHING ===");
        demonstrateIntegerCaching();
    }

    /**
     * Demonstrates Autoboxing (primitive -> wrapper) and Unboxing (wrapper -> primitive).
    */
    private static void demonstrateAutoboxingAndUnboxing() {
        // --- Autoboxing ---
        // Primitive int value
        int primitiveInt = 42;

        // Implicit Autoboxing: compiler automatically converts primitive int to Integer object
        Integer boxedInt = primitiveInt;

        // Explicit Boxing (using valueOf)
        Integer explicitBoxedInt = Integer.valueOf(primitiveInt);

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Autoboxed Integer object: " + boxedInt);
        System.out.println("Explicitly boxed Integer: " + explicitBoxedInt);

        // --- Unboxing ---
        // Integer wrapper object
        Integer wrapperInt = 100;

        // Implicit Unboxing: compiler automatically converts Integer object to primitive int
        int unboxedInt = wrapperInt;

        // Explicit Unboxing: calling intValue() explicitly
        int explicitUnboxedInt = wrapperInt.intValue();

        System.out.println("\nWrapper Integer: " + wrapperInt);
        System.out.println("Autounboxed int: " + unboxedInt);
        System.out.println("Explicitly unboxed int: " + explicitUnboxedInt);

        // Expressions with boxing & unboxing
        // Wrapper object is automatically unboxed for arithmetic addition, then result is autoboxed
        Integer sum = wrapperInt + boxedInt; // 100 + 42 = 142
        System.out.println("Sum of wrapper objects (wrapperInt + boxedInt): " + sum);
    }

    /**
     * Demonstrates Integer.decode() which converts Strings in:
     * - Hexadecimal (0x, 0X, #)
     * - Octal (leading 0)
     * - Decimal (standard numbers)
    */
    private static void demonstrateDecodeMethod() {
        // Hexadecimal string decoding (Prefix: 0x, 0X, or #)
        // Note: Prefix uses digit '0', not letter 'O'
        Integer hexNum1 = Integer.decode("0xA");   // 0xA = 10 in decimal
        Integer hexNum2 = Integer.decode("0X1F");  // 0X1F = 31 in decimal
        Integer hexNum3 = Integer.decode("#FF");   // #FF = 255 in decimal
        Integer negativeHex = Integer.decode("-0xFF"); // -255 in decimal

        System.out.println("Integer.decode(\"0xA\"):   " + hexNum1 + " (Hexadecimal)");
        System.out.println("Integer.decode(\"0X1F\"):  " + hexNum2 + " (Hexadecimal)");
        System.out.println("Integer.decode(\"#FF\"):   " + hexNum3 + " (Hexadecimal)");
        System.out.println("Integer.decode(\"-0xFF\"): " + negativeHex + " (Negative Hexadecimal)");

        // Octal string decoding (Prefix: leading 0)
        Integer octalNum = Integer.decode("012");  // Octal 012 = (1*8^1 + 2*8^0) = 10 in decimal
        System.out.println("Integer.decode(\"012\"):  " + octalNum + " (Octal)");

        // Decimal string decoding (No prefix)
        Integer decNum = Integer.decode("123");    // Decimal 123
        System.out.println("Integer.decode(\"123\"):  " + decNum + " (Decimal)");
    }

    /**
     * Demonstrates parsing methods (parseInt, parseDouble, parseBoolean)
     * and factory methods (valueOf).
    */
    private static void demonstrateParsingAndValueOf() {
        // parseInt returns primitive int
        int parsedInt = Integer.parseInt("500");

        // parseInt with custom radix (e.g., base 16 for hex)
        int parsedHex = Integer.parseInt("A", 16); // 10

        // parseDouble returns primitive double
        double parsedDouble = Double.parseDouble("99.99");

        // parseBoolean returns primitive boolean
        boolean parsedBool = Boolean.parseBoolean("true");

        System.out.println("Integer.parseInt(\"500\"): " + parsedInt);
        System.out.println("Integer.parseInt(\"A\", 16): " + parsedHex);
        System.out.println("Double.parseDouble(\"99.99\"): " + parsedDouble);
        System.out.println("Boolean.parseBoolean(\"true\"): " + parsedBool);

        // Integer.valueOf() returns an Integer wrapper object
        Integer valObj = Integer.valueOf("250");
        System.out.println("Integer.valueOf(\"250\"): " + valObj);
    }

    /**
     * Demonstrates converting numbers to Binary, Octal, and Hexadecimal Strings.
    */
    private static void demonstrateBaseConversions() {
        int number = 255;

        String binaryStr = Integer.toBinaryString(number); // "11111111"
        String octalStr  = Integer.toOctalString(number);  // "377"
        String hexStr    = Integer.toHexString(number);    // "ff"

        System.out.println("Number: " + number);
        System.out.println("Binary representation:      " + binaryStr);
        System.out.println("Octal representation:       " + octalStr);
        System.out.println("Hexadecimal representation: " + hexStr);
    }

    /**
     * Demonstrates wrapper class constants and utility inspection methods.
    */
    private static void demonstrateUtilityMethods() {
        // Min and Max Constants
        System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Double BYTES: " + Double.BYTES + " bytes (" + Double.SIZE + " bits)");

        // Integer helper methods
        int cmp = Integer.compare(15, 20); // returns negative number because 15 < 20
        System.out.println("Integer.compare(15, 20): " + cmp);

        int maxVal = Integer.max(50, 100);
        System.out.println("Integer.max(50, 100): " + maxVal);

        // Character helper methods
        char ch = 'a';
        System.out.println("Character.isLetter('" + ch + "'): " + Character.isLetter(ch));
        System.out.println("Character.isDigit('" + ch + "'): " + Character.isDigit(ch));
        System.out.println("Character.toUpperCase('" + ch + "'): " + Character.toUpperCase(ch));

        // Double special values handling
        double nanVal = 0.0 / 0.0;
        double infVal = 1.0 / 0.0;
        System.out.println("Double.isNaN(0.0/0.0): " + Double.isNaN(nanVal));
        System.out.println("Double.isInfinite(1.0/0.0): " + Double.isInfinite(infVal));
    }

    /**
     * Demonstrates Integer object caching behavior for values between -128 and 127.
     */
    private static void demonstrateIntegerCaching() {
        // Values within cache range [-128, 127] reuse cached Integer object references
        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println("num1 = 100, num2 = 100");
        System.out.println("num1 == num2 (Reference equality): " + (num1 == num2)); // true (cached)

        // Values outside cache range create NEW object instances
        Integer num3 = 200;
        Integer num4 = 200;
        System.out.println("\nnum3 = 200, num4 = 200");
        System.out.println("num3 == num4 (Reference equality): " + (num3 == num4)); // false (not cached)
        System.out.println("num3.equals(num4) (Value equality): " + num3.equals(num4)); // true
    }
}