import org.w3c.dom.Node;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


public class MyLinkedList<T>{
    private Node first;

    public MyLinkedList(){
        first = null;
    }

    public void addToLast(T item) {
        if (first == null) {
            first = new Node(item, null);
        } else {
            Node last = first;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new Node(item, null);
        }
    }

    private class Node {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
