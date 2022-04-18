package apniKaksha.LinkedList.searchElement.recursive;

// Recursive Java program to search an element
// in linked list


// Node class
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

// Linked list class
public class LL_searchElement_recursive {
    Node head;    //Head of list

    // Driver function to test the above functions
    public static void main(String[] args) {
        // Start with the empty list
        LL_searchElement_recursive l_List = new LL_searchElement_recursive();

        /* Use push() to construct below list
           14->21->11->30->10  */
        l_List.push(10);
        l_List.push(30);
        l_List.push(11);
        l_List.push(21);
        l_List.push(14);

        if (l_List.search(l_List.head, 21))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    //Inserts a new node at the front of the list
    public void push(int new_data) {
        //Allocate new node and putting data
        Node new_node = new Node(new_data);

        //Make next of new node as head
        new_node.next = head;

        //Move the head to point to new Node
        head = new_node;
    }

    // Checks whether the value x is present
    // in linked list
    public boolean search(Node head, int x) {
        // Base case
        if (head == null)
            return false;

        // If key is present in current node,
        // return true
        if (head.data == x)
            return true;

        // Recur for remaining list
        return search(head.next, x);
    }
}
