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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || right == left)return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        for(int i =1;i<left;i++){
            start = start.next;
        }
        ListNode curr = start.next;
        ListNode prev = null;
        ListNode next = null;
        for(int i = 0;i<=right-left;i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode tail = start.next;
        start.next = prev;
        tail.next = curr;
        return dummy.next;
    }
}