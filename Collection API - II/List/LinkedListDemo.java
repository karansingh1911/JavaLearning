
import java.util.LinkedList;

// Every element in the linkedList is called node, each node stores data, pointer 
// Singly LinkedList: last element points to null
// Doubly LikedList: element stores data along with two pointers ahead and aback
// Circular-Singly LinkedList: Last element has to pointer to the first element in LL
// Circular-doubly LinkedList: first node's previous(points to last element), last node's next(points to the first element)
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(12);
        linkedList.add(14);
        System.out.println(linkedList);
        linkedList.add(16); //O(1) : we just need to detach the references and recreate it 
        linkedList.remove(1); //default takes position for value deletion use (Integer)value
        linkedList.addFirst(0);//O(1)
        linkedList.addLast(1000); //O(1)
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));
    }
}
// Java: LinkedList stores its elements as nodes in a doubly linked list
//Use-cases for LinkedList:
//1. Whenever frequent insertions and deletions in the middle is needed
//2. While accessing random element, it is slower, traversal starts from the beginning
//3. Memory Overhead: Data + references to the other elements
