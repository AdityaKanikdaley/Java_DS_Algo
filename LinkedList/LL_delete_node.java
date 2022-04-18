package apniKaksha.LinkedList;

// A complete working Java program
// to demonstrate deletion
// in singly linked list

class LL_delete_node {
    Node head; // head of list

    /* Driver program to test above functions. Ideally this
    function should be in a separate user class. It is kept
    here to keep code compact */
    public static void main(String[] args) {
        LL_delete_node l_List = new LL_delete_node();

        l_List.push(7);
        l_List.push(1);
        l_List.push(3);
        l_List.push(2);

        System.out.println("\nCreated Linked list is:");
        l_List.printList();

        l_List.deleteNode(1); // Delete node with data 1

        System.out.println(
                "\nLinked List after Deletion of 1:");
        l_List.printList();
    }

    /* Given a key, deletes the first
    occurrence of key in
    * linked list */
    void deleteNode(int key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    // Inserts a new Node at front of the list. 
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* This function prints contents of linked list starting
    from the given node */
    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    // Linked list Node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
