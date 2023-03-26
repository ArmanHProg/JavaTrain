package org.homeworks.collections.linked_list;

public class MyLinkedList<E> {


    public MyLinkedList() {
        head = null;
        tail = null;
    }


    E data;
    private Node head;
    private Node tail;
    private int counter = 0;

    public void iterate() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void addFirst(E data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            tail = temp;
        } else
            head.prev = temp;

        temp.next = head;
        head = temp;
    }


    public void addLast(E data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else
            tail.next = temp;

        temp.prev = tail;
        tail = temp;
    }

    public void iterateReverse() {

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    public void removeFirst() {
        if (size() == 0) {
            throw new NullPointerException();
        } else {
            if (head.next == null) {
                tail = null;
            } else {
                head.next.prev = null;
            }
            head = head.next;

        }
    }

    public void removeLast() {
        if (size() == 0) {
            throw new NullPointerException();
        } else {
            if (head.prev == null) {
                head = null;
            } else {
                tail.next.prev = null;
            }
            tail = tail.prev;
            counter--;
        }
    }

    public int size(){
        Node temp = head;
        counter = 0;
        while (temp != null){
            counter++;
            temp = temp.next;
        }
        return counter;
    }


    public void cloneLinkedList(MyLinkedList list) {
        list.clear();
        Node temp = head;
        while(temp != null) {
            list.addLast(temp.data);
            temp = temp.next;
        }
    }


    public void clear(){
        head = null;
        tail = null;
    }


    }




