class A implements Runnable {
    @Override
    public void run() {
        // RUNNABLE
        System.out.println(Thread.currentThread().getState());
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState());
    }
}

public class Test {
    public static void main(String[] args) {

        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        System.out.println(Thread.currentThread().getState()); // main thread
        System.out.println(t1.getState()); // NEW

        t1.start();
        t2.start();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(t1.getState());

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println(t1.getState());
    }
}