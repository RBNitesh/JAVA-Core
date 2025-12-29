package throwAndThrows;

public class ThrowsDemo {
    static void checkAge(int age) throws InvalidAgeException{
        if (age < 18)
            throw new InvalidAgeException("Age is Invalid.");
    }
    public static void main(String[] a) {
        int age = 15;

        try {
            checkAge(age);
        }
        catch(InvalidAgeException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Hey I am from ThrowsDemo.java.");
        }
    }
}