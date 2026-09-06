import java.util.Arrays;

public class StackTraceDemo {
    public static void main(String[] args) {
        
        try{
            int c = 10 / 0;
        }
        catch(Exception e){
            StackTraceElement[] eles = e.getStackTrace();

            Arrays.stream(eles)
                    .forEach(
                        ele ->
                            System.err.println("Class name: " + ele.getClassName()+ "\n"
                                                + " filename: " + ele.getFileName() + "\n"
                                                + " line number: " + ele.getLineNumber()));
        }

    }
}
