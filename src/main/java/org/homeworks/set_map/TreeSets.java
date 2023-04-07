package org.homeworks.set_map;

import java.util.TreeSet;

public class TreeSets {

    public void sortTS(){

        TreeSet<Object> treeSet = new TreeSet<Object>();
        treeSet.add(45);
        treeSet.add(15);
        treeSet.add(99);
        treeSet.add(70);
        treeSet.add(65);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(60);
        treeSet.add(80);
                TreeSet<Object> res = (TreeSet<Object>)treeSet.descendingSet();
        System.out.println(res);
    }


    public TreeSet<Integer> commonElements(){

        TreeSet<Integer> first = new TreeSet<>();
        TreeSet<Integer> second = new TreeSet<>();
        TreeSet<Integer> res = new TreeSet<>();

        first.add(1);
        first.add(3);
        first.add(6);
        first.add(2);
        second.add(3);
        second.add(2);
        second.add(5);
        second.add(9);

        for (Integer integer : first) {
            for (Integer integer1 : second) {
                if (integer.equals(integer1)) {
                    res.add(integer1);
                }
            }
        }
        return res;
    }

    public TreeSet<String> uniqueElements(){

        TreeSet<String> first = new TreeSet<>();


        first.add("orange");
        first.add("apple");
        first.add("pear");
        first.add("orange");

        TreeSet<String> res = new TreeSet<>();
        for (String str : first) {
            String lowerCaseStr = str.toLowerCase();
            if (!res.contains(lowerCaseStr)) {
                res.add(lowerCaseStr);
            }
        }

        return res ;
    }
}
