package heap;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequentSort {

    public static void main(String[] args) {
        int[] nums = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        frequencySort(nums);
    }

    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(new int[]{entry.getKey(), entry.getValue()});
        }

        int index = 0;

        while (!minHeap.isEmpty()) {
            int[] min = minHeap.poll();

            while (index < nums.length && min[1] > 0) {
                nums[index++] = min[0];
                min[1]--;
            }
        }
        return nums;
    }
}
