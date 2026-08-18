package Encapsulation;

public class A {
    private String name;
    private int age;

    public A() {
    }

    // getters and setters allows the access to private fields
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}