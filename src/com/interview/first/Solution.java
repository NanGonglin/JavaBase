package com.interview.first;

public class Solution {
    /**
     * 反转单链表
     * 1、如果链表的头节点为空，就返回空。
     * 2、新建一个链表的头节点、当前节点、当前节点的前一个节点。
     * 3、如果当前节点不为空，就进入循环。
     * 4、在循环中使用交换赋值，最后将新的头节点返回。
     */
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = null;
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }

    /**
     * 判断链表是否有环
     * 1、如果头为空，就返回空
     * 2、快慢指针的思路：快指针一次走两步，慢指针一次走一步，快慢指针相遇时，会形成一个环。
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
