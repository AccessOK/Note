
import javax.swing.tree.TreeNode;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param root TreeNode类 
     * @return int整型一维数组
     */
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        if(root.!=0){
            System.out.println(root.val);
        }
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}