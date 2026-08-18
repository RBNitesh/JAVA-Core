package Iheritance;

public class ChildClass extends ParentClass{
    public ChildClass() {
        super();
        // this(10);
        System.out.println("This is constructor of child class");
    }

    public ChildClass(int a) {
        System.out.println("This is arg constructor of child class");
    }
}