import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.start();
        greeting();
    }

    public static void greeting() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Namaskaram");
        }
    }
}

