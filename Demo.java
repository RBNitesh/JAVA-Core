import java.util.*;
import java.util.function.BiConsumer;

class Node{
    int data;
    Node next;

    public Node(int x){
        this.data = x;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
    }

    public LinkedList(int x) {
        add(x);
    }

    public void add(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    public int remove(int x) {
        // if node to be removed is head
        if (head.data == x) {
            head = head.next;
            return x;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == x) {
                temp.next = temp.next.next;
                return x;
            }
            temp = temp.next;
        }

        return -1;
    }

    public void display() {
        if (head == null)
            return;
        System.out.print(head.data);

        Node temp = head.next;
        while (temp != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Demo {

    static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // LinkedList list = new LinkedList(0);

        // for(int i = 1; i <= 5; i++){
        //     list.add(i);
        // }

        // list.display();

        // System.out.println(list.remove(1));
        // System.out.println(list.remove(3));
        // System.out.println(list.remove(5));
        // System.out.println(list.remove(-1));
        // list.display();

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 5);

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println(a);
            System.out.println(b);
        };

        // print(map.containsValue(5));

        Collection<Integer> keys = map.keySet();

        keys.remove(1);
        // map.forEach((a, b) -> print("key: " + a + " val: " + b));

        print(Long.numberOfLeadingZeros(8));
        print(Integer.numberOfTrailingZeros(8));

        print(8 >>> 1);
    }
}
