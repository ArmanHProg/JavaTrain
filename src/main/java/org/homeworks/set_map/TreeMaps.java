package org.homeworks.set_map;

import java.util.*;

public class TreeMaps {
    public static List<int[]> mergeIntervals(List<int[]> intervals) {
        // sort intervals by start time
        Collections.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // use TreeMap to keep track of merged intervals
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            // get overlapping interval (if any)
            Integer floor = map.floorKey(end);
            if (floor != null && map.get(floor) >= start) {
                // merge current interval with overlapping interval
                start = Math.min(start, floor);
                end = Math.max(end, map.get(floor));
                map.remove(floor);
            }

            // add merged interval to map
            map.put(start, end);
        }

        // convert map to list of intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            mergedIntervals.add(new int[]{entry.getKey(), entry.getValue()});
        }
        return mergedIntervals;
    }
}
