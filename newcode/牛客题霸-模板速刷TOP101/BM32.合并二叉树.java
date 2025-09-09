/**
 * @nc app=nowcoder id=7298353c24cc42e3bd5f0e0bd3d1d759 topic=295 question=1025038 lang=Java
 * 2025-05-06 22:48:06
 * https://www.nowcoder.com/practice/7298353c24cc42e3bd5f0e0bd3d1d759?tpId=295&tqId=1025038
 * [BM32] 合并二叉树
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
     * @param t1 TreeNode类 
     * @param t2 TreeNode类 
     * @return TreeNode类
     */
    public void merge(TreeNode tree,TreeNode t1,TreeNode t2){
        if(t1==null){
            while(t2!=null){
                tree=
            }
        }else if(t2==null){
            tree=t1;
        }else {
            tree=new TreeNode(t1.val+t2.val);
            merge(tree.left,t1.left,t2.left);
            merge(tree.right,t1.right,t2.right);
        }
    }
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if(t1==null){
            return t2;
        }else if(t2==null){
            return t1;
        }else{
            TreeNode tree=new TreeNode(t1.val+t2.val);
            merge(tree.left,t1.left,t2.left);
            merge(tree.right,t1.right,t2.right);
            return tree;
        }
    }
}

/** @nc code=end */
