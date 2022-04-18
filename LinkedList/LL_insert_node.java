package apniKaksha.LinkedList;

// A complete working Java program to demonstrate all insertion methods
// on linked list

// refer: https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

public class LL_insert_node {
    Node head; // head of list

    /* Driver program to test above functions. Ideally this function
    should be in a separate user class. It is kept here to keep
    code compact */
    public static void main(String[] args) {
        // Start with the empty list
        LL_insert_node L_List = new LL_insert_node();

        // Insert 6. So linked list becomes 6->Null_List
        L_List.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->Null_List
        L_List.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->Null_List
        L_List.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->Null_List
        L_List.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->Null_List
        L_List.insertAfter(L_List.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        L_List.printList();
    }

    // Inserts a new Node at front of the list.
    public void push(int new_data) {
        // 1 & 2: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);

        // 3. Make next of new Node as head 
        new_node.next = head;

        // 4. Move the head to point to new Node 
        head = new_node;
    }

    // Inserts a new node after the given prev_node.
    public void insertAfter(Node prev_node, int new_data) {
        // 1. Check if the given Node is null
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        // 2 & 3: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);

        // 4. Make next of new Node as next of prev_node
        new_node.next = prev_node.next;

        // 5. make next of prev_node as new_node
        prev_node.next = new_node;
    }

    /* Appends a new node at the end. This method is
    defined inside LL_insert_node class shown above */
    public void append(int new_data) {
     /* 1. Allocate the Node &
		2. Put in the data
		3. Set next as null */
        Node new_node = new Node(new_data);

        // 4. If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        // 4. This new node is going to be the last node, so make next of it as null
        new_node.next = null;

        // 5. Else traverse till the last node
        Node last = head;
        while (last.next != null)
            last = last.next;

        // 6. Change the next of last node
        last.next = new_node;
    }

    // This function prints contents of linked list starting from the given node */
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

