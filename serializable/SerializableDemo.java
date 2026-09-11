import java.io.Serializable;

/*
    The Serializable interface in java is a marker interface available in the java.io package.
    t is used to indicate that the objects of a class can be converted into a byte stream     
    (serialization) and later reconstructed back into objects (deserialization).
    It does not contain any methods or fields and is mainly used for object persistence and 
    data transfer.
*/

class A implements Serializable {
    int data;
    String str;

    public A(int data, String s) {
        this.data = data;
        str = s;
    }
}

public class SerializableDemo {
    public static void main(String[] args) {
        A a = new A(13, "rama");
    }
}