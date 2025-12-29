package throwAndThrows;

public class ThrowDemo {
    static void checkAge(int age) {
        try{
            if (age < 18) {
                // User Defined Exception Handled using throw
                throw new InvalidAgeException("Age  is Invalid.");
            }
        }
        catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Hey I am from ThrowDemo.java.");
        }
    }
    public static void main(String[] a) {
        int age = 15;
        checkAge(age);
    }
}