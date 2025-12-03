import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {      // go to extreme left
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();         // process node
            result.add(root.val);

            root = root.right;          // go to right subtree
        }
        return result;
    }
}
 {
    
}
