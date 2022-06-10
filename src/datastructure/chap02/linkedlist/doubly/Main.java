package datastructure.chap02.linkedlist.doubly;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.add(11);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(41);
        list.add(12);
        list.add(3);
        list.add(1);

        System.out.println(list.printList());

        list.remove(3);
        list.remove(1);
        list.remove(41);
        System.out.println(list.printList());
    }



}
