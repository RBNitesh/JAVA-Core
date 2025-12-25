package Encapsulation;

public class Main {
    public static void main(String[] args) {
        A obj = new A();

        obj.setName("Unusual");
        obj.setAge(21);
        
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}