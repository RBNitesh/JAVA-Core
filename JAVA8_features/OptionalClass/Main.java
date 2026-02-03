package OptionalClass;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        
        Optional<String> checkNull = Optional.ofNullable(words[5]);

        // handling null using optional class
        if(checkNull.isPresent())
            System.out.println(words[5].toLowerCase());
        else
            System.out.println("String is Null");

        // better way to use optional class
        System.out.println(checkNull.orElse(null));
    }
}