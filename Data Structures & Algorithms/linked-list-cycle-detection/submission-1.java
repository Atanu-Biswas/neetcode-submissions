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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        if(head==null){return false;}
        while(head.next!=null){
            if(set.contains(head.next)){
                return true;
            }else{
                set.add(head);
            }
            head=head.next;
        }
        return false;
    }
}
