import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        // Taking string input
        String s = "";
        int c = 0;
        
        while (c != '\n') {
            c = System.in.read(); // reads one byte at a time
            s += (char) c;
        }

        for (char ch : s.toCharArray()) {
            System.out.write(ch); // writes one byte at a time
        }

    }
}