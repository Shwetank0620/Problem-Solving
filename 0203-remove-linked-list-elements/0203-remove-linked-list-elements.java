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
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to simplify edge cases (like removing the head)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Remove the node by skipping it
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}

