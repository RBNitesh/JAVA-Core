import java.lang.*;

public class Test1 extends Thread{
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(currentThread().getPriority());
        }
    }
}
