/**
 * @author Lingzhi Chu
 * @version 1.0.0
 * @since 2018-11-02
 *
 * Tags: linked list
 * Note: rare shown up, logic thought
 * level: medium
 * Time cost: O(n)
 * Space cost: O(1)
 * Methodology:
 * Further related:
 */


public class SwapNodesInPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode l1 = start;
        ListNode l2 = head;
        while (l2 != null && l2.next!=null) {
            ListNode nextStart = l2.next.next;
            l1.next = l2.next;
            l2.next.next = l2;
            l2.next = nextStart;
            l1 = l2;
            l2 = l2.next;
        }
        return start.next;
    }
}
