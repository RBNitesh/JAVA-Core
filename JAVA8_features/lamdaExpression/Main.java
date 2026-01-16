interface findSum {
    public abstract int sum(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        System.out.println("It's running...");

        findSum fs = (int a, int b)->{
            return a + b;
        };

        System.out.println(fs.sum(2, 3));
    }
}