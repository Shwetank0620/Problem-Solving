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
    public ListNode partition(ListNode head, int x) {
        ListNode L1 = new ListNode(0);
        ListNode L2 = new ListNode(0);
        ListNode L1head=L1;
        ListNode L2head=L2;
        while(head != null) {
            if(head.val<x){
                L1.next=head;
                L1=L1.next;
            }
            else{
                L2.next=head;
                L2=L2.next;
            }
            head=head.next;

        }
        L2.next=null;
        L1.next=L2head.next;
        return L1head.next;
    }
}