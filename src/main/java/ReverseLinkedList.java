/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: linked list
 * Note: very basic
 * level: easy
 * Time cost: O(n)
 * Space cost: O(1)
 * Methodology:
 * Further related:
 */


public class ReverseLinkedList {
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
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (head != null) {
            // Before changing next of current,
            // store next node
            next = curr.next;
            // Now change next of current
            // This is where actual reversing happens
            curr.next = prev;

            // Move prev and curr one step forward
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
