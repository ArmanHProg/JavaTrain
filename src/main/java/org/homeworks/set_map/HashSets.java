package org.homeworks.set_map;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSets {

    public HashSet<Integer> commonElements() {
        int counter = 0;
        HashSet<Integer> first = new HashSet<>();
        HashSet<Integer> second = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

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
                    result.add(integer1);
                }
            }
        }
        return result;
    }

    public void sortingHS(){
        Set<Person> set = new HashSet<>();
        set.add(new Person("Alice", 25));
        set.add(new Person("Bob", 30));
        set.add(new Person("Charlie", 20));
        set.add(new Person("Dave", 35));
        set.add(new Person("Eve", 30));

        Set<Person> sortedSet = new TreeSet<>(Comparator.comparingInt(Person::getAge));
        sortedSet.addAll(set);

        for (Person person : sortedSet) {
            System.out.println(person);
        }
    }

    public HashSet<String> getUniqueElements() {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Pear");
        hashSet.add("class");
        hashSet.add("Apple");
        hashSet.add("pear");

        HashSet<String> uniqueHashSet = new HashSet<>();
        for (String str : hashSet) {
            String lowerCaseStr = str.toLowerCase();
            if (!uniqueHashSet.contains(lowerCaseStr)) {
                uniqueHashSet.add(lowerCaseStr);
            }
        }

        return uniqueHashSet;
    }


}
