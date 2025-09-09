/**
 * @nc app=nowcoder id=75e878df47f24fdc9dc3e400ec6058ca topic=295 question=23286 lang=Java
 * 2025-05-07 22:43:04
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=295&tqId=23286
 * [BM1] 反转链表
 */

/** @nc code=start */

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类 
     * @return ListNode类
     */
    public ListNode ReverseList (ListNode head) {
        // write code here
        //处理头节点
        if(head==null){
            return null;
        }
        ListNode tmpNode=head.next;
        head.next=null;
        while(tmpNode!=null){
            ListNode tmp=tmpNode.next;
            tmpNode.next=head;
            head=tmpNode;
            tmpNode=tmp;
        }
        return head;
    }
}

/** @nc code=end */
