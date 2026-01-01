import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();

        greeting();

        Thread t2 = new Thread(new Test2());
        t2.start();
    }

    public static void greeting() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("Namaskaram");
        }
    }
}

