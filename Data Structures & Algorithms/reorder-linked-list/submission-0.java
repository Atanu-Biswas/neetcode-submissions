/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow.next);
        slow.next = null;
        ListNode cur=head;
        ListNode next=null;
        while(secondHalf!=null){
            ListNode firstNext=cur.next;
            ListNode secondNext=secondHalf.next;

            cur.next=secondHalf;
            secondHalf.next=firstNext;

            cur=firstNext;
            secondHalf=secondNext;
        }

    }
    ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }
}
