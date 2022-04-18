package apniKaksha.LinkedList.findLength.iterative;

// Java program to count number of nodes in a linked list

/* Linked list Node*/
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

// Linked List class
public class LL_findLength_iterative {
    Node head;  // head of list

    /* Driver program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args) {
        /* Start with the empty list */
        LL_findLength_iterative l_List = new LL_findLength_iterative();
        l_List.push(1);
        l_List.push(3);
        l_List.push(1);
        l_List.push(2);
        l_List.push(1);

        System.out.println("Count of nodes is " +
                l_List.getCount());
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Returns count of nodes in linked list */
    public int getCount() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}