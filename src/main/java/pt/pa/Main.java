package pt.pa;

import pt.pa.adts.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {5,1,4,3,7,4,8,9,1,4,6,4,7,6,9,5,3,6,8,4,6,9};

        // Map<Integer, Integer> uniqueCount = new MapList<>();
        Map<Integer, Integer> uniqueCount = new MapBST<>();

        for(int num : numbers) {
            if(uniqueCount.containsKey(num)) {
                int curCount = uniqueCount.get(num);
                uniqueCount.put(num, curCount + 1);
            } else {
                uniqueCount.put(num, 1);
            }
        }

        System.out.println(uniqueCount);
        //TODO: 1. show only unique numbers
        System.out.println("List of Unique numbers");
        System.out.println("\t" + uniqueCount.keys()+"\n");

        //TODO: 2. show only (sorted) unique numbers and how many times they occur
        System.out.println("List of sorted unique numbers and how many times they occur");
        List<Integer> unique_keys = new ArrayList<>(uniqueCount.keys());
        Collections.sort(unique_keys);
        System.out.println("\t" + unique_keys +"\n");

        for (Integer key: unique_keys)
            System.out.println("\tNumber [" + key + "] occurs " + uniqueCount.get(key) + " times.") ;

        System.out.println("\nTree - Visual display");
        System.out.println(uniqueCount.toString());

        // 7
        System.out.println("\nTree - keys (in-order)");
        System.out.println(uniqueCount.keys());

        System.out.println("\nTree - Values (in-order)");
        System.out.println(uniqueCount.values());

        // 6
        uniqueCount.remove(5);
        uniqueCount.remove(9);
        System.out.println("\nTree - After remove items 5 and 9");
        System.out.println(uniqueCount.toString());


        // 6
        uniqueCount.remove(8);
        uniqueCount.remove(4);
        System.out.println("\nTree - After remove items 5 and 9");
        System.out.println(uniqueCount.toString());
    }

}
