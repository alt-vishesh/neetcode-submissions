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
    public ListNode removeNodes(ListNode head) {
        ListNode curr1 = head;
        ListNode prev=null;
        while (curr1!=null){
            ListNode next=curr1.next;
            curr1.next=prev;
            prev=curr1;
            curr1=next;
        }
        head=prev;
        int max=Integer.MIN_VALUE;
        ListNode curr2=head;
        prev=null;
        while(curr2!=null){
            if(curr2.val>=max){
                max=curr2.val;
                prev=curr2;
                curr2=curr2.next;
            }
            else{
                prev.next=curr2.next;
                curr2=curr2.next;
            }
        }
        ListNode c1 = head;
        ListNode p=null;
        while (c1!=null){
            ListNode n=c1.next;
            c1.next=p;
            p=c1;
            c1=n;
        }
        return p;
    }
}
