/**
 * @nc app=nowcoder id=0bf071c135e64ee2a027783b80bf781d topic=295 question=1512964 lang=Java
 * 2025-05-05 16:44:29
 * https://www.nowcoder.com/practice/0bf071c135e64ee2a027783b80bf781d?tpId=295&tqId=1512964
 * [BM24] 二叉树的中序遍历
 */

/** @nc code=start */

import java.util.*;
import org.w3c.dom.NodeList;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param root TreeNode类 
     * @return int整型一维数组
     */
    public void inorder(List<Integer> nodeList,TreeNode root){
        if(root==null){
            return;
        }
        inorder(nodeList, root.left);
        nodeList.add(root.val);
        inorder(nodeList, root.right);
    }
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        List<Integer> nodeList = new ArrayList<>();
        inorder(nodeList,root);
        int[] result=new int[nodeList.size()];
        int res=0;
        for(int tmp:nodeList){
            result[res++]=tmp;
        }
        return result;
    }
}

/** @nc code=end */
