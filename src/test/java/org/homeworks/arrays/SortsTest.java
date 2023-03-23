package org.homeworks.arrays;

import org.homeworks.sorts.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortsTest {

    @Test
    void bubbleSortTest(){
        int[] arr = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        BubbleSort bubbleSort =new BubbleSort();
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(expected, arr);

    }


    @Test
    void selectionSortTest(){
        int[] arr = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    void insertionSortTest(){
        int[] arr = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        assertArrayEquals(expected, arr);

    }

    @Test
    void mergeSortTest(){
        int[] arr = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,0,4);
        assertArrayEquals(expected, arr);
    }

    @Test
    void HeapSortTest(){
        int[] arr = {5, 2, 8, 1, 3};
        int[] expected = {1, 2, 3, 5, 8};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        assertArrayEquals(expected, arr);
    }


}
