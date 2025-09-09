/**
 * @nc app=nowcoder id=5dfded165916435d9defb053c63f1e84 topic=295 question=2427094 lang=Java
 * 2025-05-08 08:48:50
 * https://www.nowcoder.com/practice/5dfded165916435d9defb053c63f1e84?tpId=295&tqId=2427094
 * [BM100] 设计LRU缓存结构
 */

/** @nc code=start */

import java.util.*;


public class Solution {

    static class DoubleListNode{
        int val;
        int key;
        DoubleListNode next = null;
        DoubleListNode last = null;
        public DoubleListNode(int key,int val) {
          this.val = val;
        }
    }

    private HashMap<Integer,DoubleListNode> map;
    //Tree中的val保存key值
    private DoubleListNode head;
    private DoubleListNode tail;
    private Integer number;

    public Solution(int capacity) {
        // write code here
        this.map=new HashMap<>(capacity);
        this.head=null;
        this.tail=null;
        this.number=0;
    }

    public int get(int key) {
        // write code here
        if(map.containsKey(key)){
            //将使用过的值放到队尾
            DoubleListNode current=map.get(key);
            DoubleListNode last=current.last;
            DoubleListNode next=current.next;
            last.next=next;
            next.last=last;
            tail.last=current;
            current.last=tail;
            tail=current;
            return current.val;
        }else{
            return -1;
        }
    }

    public void set(int key, int value) {
        // write code here
        //如果不在当前缓存中，保存数据并更新链表
        DoubleListNode node=new DoubleListNode(key,value);
        if(!map.containsKey(key)){
            //当前缓存有空间
            if(number<map.size()){
                map.put(key, node);
                number++;
                if(head==null){
                    //赋值头节点
                    head=node;
                    tail=head;
                }else{
                    //头节点已存在
                    tail.next=node;
                    tail=node;
                }
            }else{
                //当前缓存不够，表头为最近最少使用
                DoubleListNode headNode=head;
                head=head.next;
                headNode.next=null;
                //插入数据，指针向后
                map.put(key, node);
            }
        }else{
            //当前数据存在,替换当前数据
            DoubleListNode current=map.get(key);
            //跳过当前节点
            DoubleListNode last=current.last;
            DoubleListNode next=current.next;
            last.next=node;
            node.last=last;
            node.next=next;
            next.last=node;
            current.last=null;
            current.next=null;
            map.replace(key, node);
        }
        //访问过的数据移动到表尾
        tail.next=node;
        tail=node;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution solution = new Solution(capacity);
 * int output = solution.get(key);
 * solution.set(key,value);
 */

/** @nc code=end */
