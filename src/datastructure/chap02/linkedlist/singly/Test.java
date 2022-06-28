package datastructure.chap02.linkedlist.singly;

import day14.abs.pet.Dog;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        SimpleLinkedList<String> list = new SimpleLinkedList<>();

        list.addFirst("오징어");
        list.addFirst("문어");
        list.addFirst("쭈꾸미");

        String s = list.printList();
        System.out.println(s);

        SimpleLinkedList<Double> dList = new SimpleLinkedList<>();
        dList.addFirst(1.1);
        dList.addFirst(2.2);
        dList.addFirst(3.3);

        String d = dList.printList();
        System.out.println(d);

    }
}
