package heap;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {4, 1, -1, 2, -1, 2, 3};
        int k = 2;
        topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        // Priority Queue implementing min heap of Pairs
        // Creating instance of PriorityQueue by passing
        // Comparator as a constructor parameter
        PriorityQueue<Pair<Integer, Integer>> pq =
                new PriorityQueue<Pair<Integer, Integer>>(
                        (a, b) -> {
                            if (a.getValue() < b.getValue())
                                return -1;
                            if (a.getValue() > b.getValue())
                                return 1;
                            return 0;
                        });

        int[] arr = new int[k];


        for (int element : nums) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // Looping through the HashMap
        // Using for-each loop
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            int key = mapElement.getKey();
            // Adding some bonus marks to all the students
            int value = mapElement.getValue();
            pq.add(new Pair<>(key, value));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = 0;
        while (i < k) {
            arr[i++] = pq.poll().getKey();
        }

        return arr;
    }

}
