package org.homeworks.collections.array_list;

import java.util.*;

public class MyArrayList<E> {

    private E[] list;
    private int size;
    private final int defCapacity = 10;


    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0");
        } else {
            list = (E[]) new Object[capacity];
        }
    }

    public MyArrayList() {
        list = (E[]) new Object[defCapacity];
    }


    public void add(E item) {
        list[size++] = item;
    }

    public void add(int index, E element) {
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = element;
        size++;

    }

    public void iterate() {
        for (E elem : list) {
            System.out.println(elem + " ");
        }

    }

    public void insertFirst(E element) {
        add(0,element);
    }

    public void update(int index, E element) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        list[index] = (E) element;
    }

    public int search(E element) {
        if (element == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (element.equals(list[i]))
                return i;
        }
        return -1;
    }

    public E[] reverse() {
        E[] arr = (E[]) new Object[list.length];
        int index = 0;
        for (int i = size - 1; i >= 0; i--) {
            arr[index] = list[i];
            index++;
        }
        for (int i = 0; i < size; i++) {
            list[i] = arr[i];
        }
        return list;
    }

    public E[] swap(int first_index, int second_index) {
        if (first_index >= size || second_index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object temp = list[first_index];
        list[first_index] = list[second_index];
        list[second_index] = (E) temp;
        return list;

    }

    public boolean isEmpty(){
        if (list[0] == null){
            return true;
        }
        return false;
    }

    public void delete(int index){
        for (int i =index ; i < size; i++) {
            list[i] = list[i+1];
        }
    }
}