class Demo {
    static void show() {
        System.out.println("Demo");
    }
}

class Test extends Demo {
    static void show() {
        System.out.println("Test");
    }
}

public class Main{
    public static void main(String[] args){
        Demo obj = new Test();
        obj.show(); // prints Demo
        /*
            static methods are resolved at compile time, 
            based on the reference type, not the actual object.
            Hence, they do not participate in runtime polymorphism.
        */
    }
}

