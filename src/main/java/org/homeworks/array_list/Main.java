package org.homeworks.array_list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    MyArrayList myArrayList = new MyArrayList(10);

    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    myArrayList.add(4);
    myArrayList.add(1,8);
    myArrayList.insertFirst(0);
    myArrayList.update(2,8);
    myArrayList.swap(0,4);


        myArrayList.iterate();


    }

}
