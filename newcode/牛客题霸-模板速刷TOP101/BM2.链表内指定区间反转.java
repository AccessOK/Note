/**
 * @nc app=nowcoder id=b58434e200a648c589ca2063f1faf58c topic=295 question=654 lang=Java
 * 2025-05-07 23:07:51
 * https://www.nowcoder.com/practice/b58434e200a648c589ca2063f1faf58c?tpId=295&tqId=654
 * [BM2] 链表内指定区间反转
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
     * @param m int整型 
     * @param n int整型 
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head==null){
            return null;
        }
        //保存列表头
        ListNode result=head;
        //定位到需要开始反转的位置
        int mark=1;
        while(head!=null&&m>mark){
            head=head.next;
            mark++;
        }
        //开始反转
        ListNode tmpNode=head;
        head.next=
        while(mark<n)
    }
}

/** @nc code=end */
