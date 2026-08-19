package staticBlock;

class Test {
    final static int i; 

    Test() {
        System.out.println("Constructor of test class");
    }

    /*
        - static block is executed when the JVM loads the class into memory, 
            before the main or any constructors/object is created
        - static block is called only once
        - value for final field can be assigned in static block
        - A class can have multiple static block
    */
    static {
        i = 10;
        System.out.println("static block of test class");
    }
}

public class Main {
    /*
        - before jdk-1.6 we can print something on console without creating main() method
        but after that this will throw an error
    */
    static {
        System.out.println("static Block inside Main Class");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        Test obj2 = new Test();
    }
}
