package org.homeworks.collections.exercises;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Homeworks homeworks =new Homeworks();
//        homeworks.positiveInteger();
//        homeworks.sort();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-1);
        arrayList.add(8);
        arrayList.add(0);
        arrayList.add(-8);
        arrayList.add(1);
//        homeworks.removeNegatives(arrayList);
        homeworks.removeEven(arrayList);
    }
}
