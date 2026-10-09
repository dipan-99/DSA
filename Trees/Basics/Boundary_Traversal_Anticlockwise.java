package Trees.Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boundary_Traversal_Anticlockwise {
    
    // TC = O(N), SC = O(N)
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        if (!isLeaf(root)) {
            result.add(root.val);
        }

        // Left boundary: top to bottom
        TreeNode curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr)) {
                result.add(curr.val);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        // All leaf nodes: left to right
        addLeaves(root, result);

        // Right boundary: collect bottom to top
        List<Integer> rightBoundary = new ArrayList<>();
        curr = root.right;

        while (curr != null) {
            if (!isLeaf(curr)) {
                rightBoundary.add(curr.val);
            }

            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        Collections.reverse(rightBoundary);
        result.addAll(rightBoundary);

        return result;
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    private void addLeaves(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        if (isLeaf(root)) {
            result.add(root.val);
            return;
        }

        addLeaves(root.left, result);
        addLeaves(root.right, result);
    }
}
