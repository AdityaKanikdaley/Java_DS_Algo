package apniKaksha.LinkedList.customLL;

public class LL_Driver {
    public static void main(String[] args) {
        MyLinkedList<Integer> myIntLL = new MyLinkedList<>();
        for (int i = 0; i < 10; i++)
            myIntLL.add(i);
        myIntLL.print();

        System.out.println();

        MyLinkedList<String> myStringLL = new MyLinkedList<>();
        for (int i = 0; i < 10; i++)
            myStringLL.add(i + " added ");
        myStringLL.print();
    }
}
