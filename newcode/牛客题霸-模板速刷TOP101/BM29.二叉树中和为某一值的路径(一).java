/**
 * @nc app=nowcoder id=508378c0823c423baa723ce448cbfd0c topic=295 question=40187 lang=Java
 * 2025-05-05 18:01:18
 * https://www.nowcoder.com/practice/508378c0823c423baa723ce448cbfd0c?tpId=295&tqId=40187
 * [BM29] 二叉树中和为某一值的路径(一)
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
     * @param sum int整型 
     * @return bool布尔型
     */
    public void  sumPath(List<Integer> sumList,TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            root.left.val+=root.val;
        }
        if(root.right!=null){
            root.right.val+=root.val;
        }
        if(root.left==null&&root.right==null){
            sumList.add(root.val);
            return;
        }
        sumPath(sumList,root.left);
        sumPath(sumList, root.right);
    }
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        List<Integer> sumList=new ArrayList<>();
        sumPath(sumList, root);
        for(int i:sumList){
            if(i==sum){
                return true;
            }
        }
        return false;
    }
}

/** @nc code=end */
