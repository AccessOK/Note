/**
 * @nc app=nowcoder id=8a2b2bf6c19b4f23a9bdb9b233eefa73 topic=295 question=642 lang=Java
 * 2025-05-05 17:06:25
 * https://www.nowcoder.com/practice/8a2b2bf6c19b4f23a9bdb9b233eefa73?tpId=295&tqId=642
 * [BM28] 二叉树的最大深度
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
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        // write code here
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}

/** @nc code=end */
