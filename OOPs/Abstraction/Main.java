package Abstraction;

// interface provides complete abstraction
// interface cannot have concrete methods
interface TV2 {
    // by default fields of interface are public static final
    int a = 10;
    String name = "nitesh";

    void turnon();
    void turnoff();

    // interface can have default and/or static methods
    // default methods of interface can be overidden by subclass than implements interface
    default void fun() {
        System.out.println("This is default method");
    }

    // static methods cannot be overidden
    static void f() {
        System.out.println("This is static method of interface.");
    }
}

class TVRemote2 implements TV2 {
    public void turnon(){
        System.out.println("Implementing the turnon method of interface.");
    }

    public void turnoff() {
        System.out.println("Implementing the turnoff method of the interface.");
    }
    
    @Override
    public void fun() {
        System.out.println("Overridding the default method of interface.");
    }
}

// abstract class provides partial abstraction
// It can contains both abstract methods and concrete methods
abstract class TV {
    abstract void turnon();

    abstract void turnoff();

    void playgame() {
        System.out.println("You can play game.");
    }
}

class TVRemote extends TV{
    @Override
    void turnon() {
        System.out.println("TV is turned on.");
    }

    @Override
    void turnoff() {
        System.out.println("TV is turned off.");
    }
}

public class Main{
    public static void main(String[] args){
        TV obj = new TVRemote();
        obj.turnon();
        obj.turnoff();
        obj.playgame();

        TV2 obj2 = new TVRemote2();
        obj2.turnon();
        obj.turnoff();
        obj2.fun();
        
        // static method cannot be accessed using onject of child class
        // static method belong to class not object
        TV2.f(); 
    }
}
