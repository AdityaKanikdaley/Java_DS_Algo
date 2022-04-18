package apniKaksha.LinkedList;

public class merge_sort {

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

    public Node mergeSort(Node list1, Node list2){

        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        // start with the head whose value is low
        if(list1.data < list2.data){
            list1.next = mergeSort(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeSort(list1, list2.next);
            return list2;
        }
    }

    public void printList(Node list) {
        Node tNode = list;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {

        merge_sort list1 = new merge_sort();
        list1.addElement(1);
        list1.addElement(2);
        list1.addElement(4);

        merge_sort list2 = new merge_sort();
        list2.addElement(3);
        list2.addElement(5);
        list2.addElement(6);

        merge_sort merger = new merge_sort();
        Node result = merger.mergeSort(list1.head, list2.head);
        merger.printList(result);

    }
}
