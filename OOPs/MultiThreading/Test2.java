import java.lang.*;

public class Test2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i += 1)
            System.out.println(Thread.currentThread().getName());
    }
}
