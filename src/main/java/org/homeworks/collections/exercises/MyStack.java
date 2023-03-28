package org.homeworks.collections.exercises;

import java.util.ArrayList;

public class MyStack<E> {

    private ArrayList<E> list = new ArrayList<>();

    public void push(E element){
        list.add(element);
    }

    public E pop(){
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
