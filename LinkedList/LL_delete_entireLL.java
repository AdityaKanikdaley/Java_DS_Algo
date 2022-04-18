package apniKaksha.LinkedList;

// Java program to delete a linked list
class LL_delete_entireLL {
    Node head; // head of the list

    public static void main(String[] args) {
        LL_delete_entireLL l_List = new LL_delete_entireLL();
        // Use push() to construct below list 1->12->1->4->1

        l_List.push(1);
        l_List.push(4);
        l_List.push(1);
        l_List.push(12);
        l_List.push(1);

        System.out.println("Deleting the list");
        l_List.deleteList();

        System.out.println("Linked list deleted");
    }

    // Function deletes the entire linked list
    void deleteList() {
        head = null;
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

    // Linked List node
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
