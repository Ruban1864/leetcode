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
    public ListNode reverseList(ListNode head) {
        if( head == null ) return null;
        ListNode cnode = head;
        ListNode pnode = null , nnode = null;
        while(cnode != null){
            nnode = cnode.next;
            cnode.next = pnode;
            pnode = cnode;
            cnode = nnode;
        }
        return pnode;
    }
}