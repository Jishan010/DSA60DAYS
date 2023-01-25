package recursion;

import java.util.ArrayList;
import java.util.List;

//leetcode 39 - combination sum
public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        System.out.println(combinationSum(candidates, target));
    }


    public static void combination(int index, int target, int[] candidates, List<List<Integer>> ans, List<Integer> combs) {

        //base condition
        if (index == candidates.length) {

            if (target == 0) {
                ans.add(new ArrayList<>(combs));
            }
            return;
        }

        //pick condition
        if (candidates[index] <= target) {
            combs.add(candidates[index]);
            combination(index, target - candidates[index], candidates, ans, combs);
            //remove the added value from target and list combs to make it ready for not pick condition
            combs.remove(combs.size() - 1);
        }

        //do not pick condition
        combination(index + 1, target, candidates, ans, combs);
    }


    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combs = new ArrayList<>();
        combination(0, target, candidates, ans, combs);
        return ans;
    }

}
