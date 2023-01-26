package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class LevelOrderTraverse {

//Definition for a binary tree node.

    public static void main(String[] args) {

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while (!queue.isEmpty()) {

            //start current level
            ans.add(new ArrayList<Integer>());

            //number of elements in current level
            int numberOfelements = queue.size();
            for (int i = 0; i < numberOfelements; i++) {
                TreeNode node = queue.poll();

                //add the values from current level
                ans.get(level).add(node.val);

                //prepare for the next level , by adding its left and right child in queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            level++;
        }
        return ans;
    }
}