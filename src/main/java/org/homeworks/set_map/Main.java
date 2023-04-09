package org.homeworks.set_map;

import java.util.ArrayList;
import java.util.List;

import static org.homeworks.set_map.TreeMaps.mergeIntervals;

public class Main {
    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{2, 6});
        intervals.add(new int[]{8, 10});
        intervals.add(new int[]{15, 18});
        intervals.add(new int[]{18, 20});
//        intervals.add(new int[]{5, 19});

        List<int[]> mergedIntervals = mergeIntervals(intervals);
        for (int[] interval : mergedIntervals) {
            System.out.print("(" + interval[0] + ", " + interval[1] + ") ");
        }
    }
    }

