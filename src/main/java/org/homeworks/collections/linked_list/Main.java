package org.homeworks.collections.linked_list;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(5);
        list.addLast(6);


        list.removeFirst();
        list.iterate();



    }
}
