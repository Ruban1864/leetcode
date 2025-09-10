/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if( head == null || head.next == null ) return null;

        ListNode slow = head , fast = head;
        while( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast ){
                ListNode fast1 = head;
                while( fast1 != slow ){
                    slow = slow.next;
                    fast1 = fast1.next;
                }
                return slow;
            }
        }
        return null;
    }
}