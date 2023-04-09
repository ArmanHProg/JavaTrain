package org.homeworks.set_map;

import java.util.HashMap;

public class HashMaps {

        public int anagramPairs(){
            HashMap<Integer, String> hashMap = new HashMap<>();
            hashMap.put(0, "dog");
            hashMap.put(1, "act");
            hashMap.put(2, "mice");
            hashMap.put(3, "god");
            hashMap.put(4, "cat");
            hashMap.put(5, "odg");

            int tmp1 = 0;
            int tmp2 = 0;
            int counter = 0;
            for (int i = 0; i < hashMap.size() - 1; i++) {
                for (int k = 0; k < hashMap.get(i).length(); k++) {
                    tmp1 += hashMap.get(i).charAt(k);
                }
                for (int j = i + 1; j < hashMap.size(); j++) {
                    for (int k = 0; k < hashMap.get(j).length(); k++) {
                        tmp2 += hashMap.get(j).charAt(k);
                    }
                    if (tmp1 == tmp2) {
                        counter++;
                    }
                    tmp2 = 0;
                }
                tmp1 = 0;
            }
            return counter * 2;
        }





}
