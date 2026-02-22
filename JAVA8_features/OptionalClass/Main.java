package OptionalClass;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        
        // Optional<String> checkNull = Optional.ofNullable(words[5]);

        // // handling null using optional class
        // if(checkNull.isPresent())
        //     System.out.println(words[5].toLowerCase());
        // else
        //     System.out.println("String is Null");

        // // better way to use optional class
        // System.out.println(checkNull.orElse(null));


        // Creating Optional Object
        // Optional.empty(): Returns an Empty Optional.
        // Optional.of(val): Returns an Optional Containing the given non-null value.
        // Optional.ofNullable(val): Returns an Optional describing val if non-null, otherwise empty

        words[3] = "Learning Java is a fun.";
        words[4] = "Making some project is more fun.";

        // Optional<String> empty = Optional.empty();
        // System.out.println(empty);

        // // Optional<String> op1 = Optional.of(words[2]); // can't have null in argument it would throw null pointer exception
        // Optional<String> op2 = Optional.of(words[3]);
        // Optional<String> op3 = Optional.ofNullable(words[2]); // can have null in argument
        // Optional<String> op4 = Optional.ofNullable(words[3]);

        // System.out.println(op2 + " " + op3 + " " + op4);


        // Using get(), hashCode() and isPresent() in Optional
        Optional<String> optional = Optional.ofNullable(words[4]);
        System.out.println(optional.get()); // Returns the value if present, else throws NoSuchElementException
        System.out.println(optional.hashCode()); // Returns the hash code of the value if present, otherwise returns 0.
        System.out.println(optional.isPresent());

        // orElse(): returns the val if present otherwise returns the provided default value.
        System.out.println(optional.orElse("null")); 
    }
}



