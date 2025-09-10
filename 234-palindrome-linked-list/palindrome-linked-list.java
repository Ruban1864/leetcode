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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head , fast = head;
         while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head1 = reverseList(slow);
        while(head != null && head1 != null){
            if( head.val != head1.val){
                return false;
            }
            head = head.next;
            head1 = head1.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next; 
            curr.next = prev;              
            prev = curr;                  
            curr = nextNode;               
        }
        return prev; 
    }
}