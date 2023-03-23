package org.homeworks.sorts;

public class Main {

    public static void main(String[] args) {

        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 12, 5, 2, 80 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }
}
