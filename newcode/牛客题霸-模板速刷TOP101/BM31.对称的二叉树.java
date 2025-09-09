/**
 * @nc app=nowcoder id=ff05d44dfdb04e1d83bdbdab320efbcb topic=295 question=40189 lang=Java
 * 2025-05-05 23:59:18
 * https://www.nowcoder.com/practice/ff05d44dfdb04e1d83bdbdab320efbcb?tpId=295&tqId=40189
 * [BM31] 对称的二叉树
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
     * @param pRoot TreeNode类 
     * @return bool布尔型
     */
    
     public boolean symmetrical(TreeNode leftNode,TreeNode rightNode){
        //节点值或者其左右子树不对称,返回false
        if(leftNode.val!=rightNode.val
        ||leftNode.left==null&&rightNode.right!=null
        ||leftNode.left!=null&&rightNode.right==null
        ||leftNode.right==null&&rightNode.left!=null
        ||leftNode.right!=null&&rightNode.left==null
        ){
            return false;
        }
        //如果当前节点值相等，继续判断其子树的情况
        else{
            boolean tmpa=true;
            boolean tmpb=true;
            if(leftNode.left!=null&&rightNode.right!=null){
                tmpa=symmetrical(leftNode.left, rightNode.right);
            } else if(leftNode.left!=null&&rightNode.right==null||leftNode.left==null&&rightNode.right!=null){
                tmpa=false;
            }
            if(leftNode.right!=null&&rightNode.left!=null){
                tmpb=symmetrical(leftNode.right, rightNode.left);
            }else if(leftNode.right!=null&&rightNode.left==null||leftNode.right==null&&rightNode.left!=null){
                tmpb=false;
            }
            return tmpa&&tmpb;
        }
    }
    public boolean isSymmetrical (TreeNode pRoot) {
        // write code here
        if(pRoot==null||pRoot.right==null&&pRoot.left==null){
            return true;
        }else if(pRoot.left==null&&pRoot.right!=null||pRoot.left!=null&&pRoot.right==null){
            return false;
        }else{
            return symmetrical(pRoot.left,pRoot.right);
        }
    }
}
/** @nc code=end */