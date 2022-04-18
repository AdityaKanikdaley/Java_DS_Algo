package apniKaksha.LinkedList.customLL;

public class MyLinkedList<E> {  // we write <E> to make class generic so that it will support multiple data-types

    Node<E> head;

    void add(E data) {
        Node<E> toAdd = new Node<E>(data);

        if (isEmpty()) { // if LinkedList is empty then the head will be toAdd element
            head = toAdd;
            return;
        }

        Node<E> temp = head;    // temp node to traverse to get to the last element from head
        while (temp.next != null) { // last element's next = null
            temp = temp.next;
        }
        temp.next = toAdd;  // now that temp is pointing to the last next. we will poE tem.next to toAdd
    }

    void print() {
        Node<E> temp = head;    // temp node to traverse to get to the last element from head
        while (temp != null) { // last element = null
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    boolean isEmpty() {
        return head == null; // if head is empty then it will return true, else false
        /*

        long form:
        if(head == null) return true;
        else return false;

         */
    }

    static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
}
