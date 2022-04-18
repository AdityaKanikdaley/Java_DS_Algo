package apniKaksha.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class merge_sort_set {

    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){ this.data = data; next = null; }
    }

     void addElement(int new_data){
        Node newNode = new Node(new_data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = null;
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;

    }

    void mergeLL(Node l1, Node l2){
        Node last_l1 = l1;

        while (last_l1.next != null)
            last_l1 = last_l1.next;

        last_l1.next = l2;

        setCreate(l1);
    }

    void setCreate(Node l1){
        Set<Integer> set = new HashSet<>();

        Node temp = l1;
        while (temp != null){
            set.add(temp.data);
            temp = temp.next;
        }

        for (int i: set) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        merge_sort_set lList1 = new merge_sort_set();
        lList1.addElement(1);
        lList1.addElement(1);
        lList1.addElement(2);
        lList1.addElement(2);

        merge_sort_set lList2 = new merge_sort_set();
        lList2.addElement(1);
        lList2.addElement(4);
        lList2.addElement(7);
        lList2.addElement(7);

        merge_sort_set merger = new merge_sort_set();
        merger.mergeLL(lList1.head, lList2.head);
    }
}
