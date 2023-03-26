package org.homeworks.collections.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homeworks {

    ArrayList<Integer> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void positiveInteger(){

        System.out.println("Enter positive numbers");
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty())
                break;

            int number = Integer.parseInt(line);
            if (number > 0) {
                arrayList.add(number);
            }
        }
            int sum = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                sum += arrayList.get(i);
            }
            double average = (double) sum / arrayList.size();
            System.out.println("\nSum = " + sum);
            System.out.println("\nAverage = " + average);
        }


        public void sort(){

            System.out.println("Enter positive numbers");
            while (true) {
                String line = sc.nextLine();
                if (line.isEmpty())
                    break;

                int number = Integer.parseInt(line);
                if (number > 0) {
                    arrayList.add(number);
                }
            }

            int[] arr = new int[arrayList.size()];
            for (int i = 0; i <arr.length; i++) {
                arr[i] = arrayList.get(i);
            }
            Arrays.sort(arr);
            arrayList.clear();

            System.out.println("sorted array");
            for (int i = 0; i < arr.length; i++) {
                arrayList.add(arr[i]);
                System.out.print(arr[i] + "  ");
            }
            
        }


        public ArrayList<Integer> removeNegatives(ArrayList<Integer> list){

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0) {
                    list.remove(i);
                    i--;

                }
            }
            System.out.println("list without negative numbers");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i) + " ");
            }
            return list;
        }


        public void removeEven(ArrayList<Integer> list){

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) %2 != 1) {
                    list.remove(i);
                    i--;

                }
            }
            System.out.println("removed evens");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i) + " ");
            }

        }


}


