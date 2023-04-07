package org.homeworks.generics;

import javax.print.attribute.standard.Media;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Generics<T extends Media> {

    public <T> void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

/*

Will the following class compile? If not, why?
public final class Algorithm {
public static <T> T max(T x, T y) {
        return x > y ? x : y;
        }
        }

   ***  This code can't run because operator > we can use only with primitive numeric types
*/


    public <T> void maxRange(List<T> list, int begin, int end, Comparator<T> cmp) {

        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (cmp.compare(current, max) > 0) {
                max = current;
            }
        }

    }

    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

}

