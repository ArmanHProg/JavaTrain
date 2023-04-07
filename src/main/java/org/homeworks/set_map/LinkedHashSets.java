package org.homeworks.set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSets {

    public void removeEvenNumbers() {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(-3);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(54);
        linkedHashSet.add(33);
        linkedHashSet.add(12);
        linkedHashSet.add(32);
        linkedHashSet.add(11);

        LinkedHashSet<Object> newSet = new LinkedHashSet<>();


        for (Integer integer : linkedHashSet) {
            if (integer % 2 != 0) {
                newSet.add(integer);
            }
        }
    }


    public void orderByCarYear() {
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<Person>();

        linkedHashSet.add(new Person("David", 25));
        linkedHashSet.add(new Person("Jayce", 21));
        linkedHashSet.add(new Person("Natasha", 19));

        ArrayList<Person> arrayList = new ArrayList<>(linkedHashSet);
        Collections.sort(arrayList);

    }

    public void removeDuplicateNames() {

        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<Person>();

        linkedHashSet.add(new Person("David", 25));
        linkedHashSet.add(new Person("Jayce", 21));
        linkedHashSet.add(new Person("David", 25));

        ArrayList<Person> arrayList = new ArrayList<>(linkedHashSet);

        LinkedHashSet<String> names = new LinkedHashSet<>();
        LinkedHashSet<Person> uniqueSet = new LinkedHashSet<>();
        for (Person person : linkedHashSet) {
            if (!names.contains(person.getName())) {
                uniqueSet.add(person);
                names.add(person.getName());
            }
        }

    }
}