/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: linked list
 * Note: plug in test cases to ensure the boundary
 * level: medium
 * Time cost: O(n)
 * Space cost: O(1)
 * Methodology: Two pointer
 * Further related:
 */



public class RemoveNthNodeFromEndOfList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
     public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

     class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode start = new ListNode(0);
            ListNode slow = start;
            ListNode fast = start;
            start.next = head;
            for (int i=0; i <= n; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return start.next;
        }
     }
}
