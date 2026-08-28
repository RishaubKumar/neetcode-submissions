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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;
        ListNode l = null ;
        while(t1 != null || t2 != null){
            int val1 =0;
            if(t1 != null){
                val1 = t1.val;
            }
            int val2 =0;
            if(t2 != null){
                val2 = t2.val;
            }
            int result = val1 + val2 +carry;
            tail.next = new ListNode(result%10);
            tail = tail.next;
            carry = result/10;
            if(t1 != null){
            t1 = t1.next;
            }
            if(t2 != null){
            t2 = t2.next;
            }
        }
        if(carry != 0){
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
