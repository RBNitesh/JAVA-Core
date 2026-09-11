import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        // Read and write streams of character
        Reader reader = new BufferedReader(null);
        Writer writer = new BufferedWriter(null);

        // Read and write streams of byte
        InputStream is = new BufferedInputStream(null);
        OutputStream os = new BufferedOutputStream(null);
    }
}
