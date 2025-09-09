/**
 * @nc app=nowcoder id=1291064f4d5d4bdeaefbf0dd47d78541 topic=295 question=2291301 lang=Java
 * 2025-05-05 16:50:31
 * https://www.nowcoder.com/practice/1291064f4d5d4bdeaefbf0dd47d78541?tpId=295&tqId=2291301
 * [BM25] 二叉树的后序遍历
 */

/** @nc code=start */

import java.util.*;

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
    public void postorder(List<Integer> nodeList,TreeNode root){
        if(root==null){
            return;
        }
        postorder(nodeList, root.left);
        postorder(nodeList, root.right);
        nodeList.add(root.val);
    }
    public int[] postorderTraversal (TreeNode root) {
        // write code here
        List<Integer> nodeList=new ArrayList<>();
        postorder(nodeList,root);
        int[] result=new int[nodeList.size()];
        int res=0;
        for(int tmp:nodeList){
            result[res++]=tmp;
        }
        return result;
    }
}

/** @nc code=end */
