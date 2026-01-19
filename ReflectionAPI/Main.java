import java.lang.reflect.*;

public class Main{
    public static void main(String abc[]){
        System.out.println("Program is running...");
        
        // short var = 5;
        // Class c1 = short.class;
        // System.out.println(c1);

        // Class c2 = int[][].class;
        // System.out.println(c2);
        // 
        // Class c3 = "abc".getClass();
        // System.out.println(c3);
        // System.out.println(java.lang.String.class);

        Parents parents = new Parents();
        
        for (Class<?> c : parents.getClass().getDeclaredClasses()) {
            System.out.println(c);
        }

        for (Class<?> c : parents.getClass().getDeclaredClasses()) {
            System.out.println(c.getDeclaringClass());
        }

        Children childrens = new Children();

        Class<?>[] arr = childrens.getClass().getDeclaredClasses();
        for (Class<?> c : arr) {
            System.out.println(c.getSuperclass());
        }
    }
}
