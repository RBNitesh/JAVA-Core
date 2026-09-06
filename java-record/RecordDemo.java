import java.util.Arrays;

record Pair(int key, Object val) {
};

record State(int row, int col, int cost) {
};

public class RecordDemo {
    public static void main(String[] args) {
        Pair p = new Pair(2, Arrays.asList(2, 3, 4));
        IO.println(p.toString());

        State state = new State(1, 2, 30);
        IO.println(state.row());
    }
}