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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int multiplier = 1;
        int sum=0;
        int carry=0;
        ListNode res=new ListNode();
        ListNode head=res;
        while(!(l1==null && l2==null)){
            int val1=(l1!=null)?l1.val:0;
            int val2=(l2!=null)?l2.val:0;
            sum=val1+val2+carry;
            carry=0;
            if(sum<10){
            res.next= new ListNode(sum);
            }else{
            res.next= new ListNode(sum-10);
            carry=1;
            }
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
            res=res.next;
        }
        if(carry!=0){
            res.next= new ListNode(1);
        }

        return head.next;
    }
}
