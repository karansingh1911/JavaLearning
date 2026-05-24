// Analogy to understand how node in linkedList behaves.

public class NodeDemo {

    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.value = 20;
        node1.next = node2;

        node2.value = 20;
        node2.next = node3;

        node3.value = 20;
        node3.next = null;
        System.out.println(node1);
        System.out.println(node2);
        System.out.println(node3);
    }

}

class Node {

    public int value; // stores value
    public Node next; // stores next
}
