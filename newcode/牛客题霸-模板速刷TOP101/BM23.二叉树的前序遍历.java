/**
 * @nc app=nowcoder id=5e2135f4d2b14eb8a5b06fab4c938635 topic=295 question=2291302 lang=Java
 * 2025-05-05 15:25:36
 * https://www.nowcoder.com/practice/5e2135f4d2b14eb8a5b06fab4c938635?tpId=295&tqId=2291302
 * [BM23] 二叉树的前序遍历
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
    public void preorder(List<Integer> noedList,TreeNode root){
        if(root==null){
            return;
        }
        noedList.add(root.val);
        preorder(noedList, root.left);
        preorder(noedList, root.right);
    }
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        List<Integer> nodeList=new ArrayList<>();
        preorder(nodeList,root);
        Iterator<Integer> tmp=nodeList.iterator();
        while (tmp.hasNext()) {
            System.out.println(tmp.next());
        }
        int[] result=new int[nodeList.size()];
        int res=0;
        for(int num:nodeList){
            result[res++]=num;
        }
        return result;
    }
}

/** @nc code=end */
