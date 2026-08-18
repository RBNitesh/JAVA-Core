package ThisKeyword;

public class A {
    int a, b;
    // default constructor

    A() {
        // constructor call using this keyword
        this(10, 20);
        System.out.println("This is Default Constructor.");
    }

    A(int a, int b) {
        // refering fields of current object using this keyword
        this.a = a;
        this.b = b;

        System.out.println("This is Parametrized Constructor.");
    }

    // returns the instance of current class (current object)
    A get() {
        return this;
    }

    void display(A o) {
        System.out.println("a = " +o.a+ " b = " + o.b);
    }
}




