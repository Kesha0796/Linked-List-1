/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode reverse= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reverse;
    }
}

// Recursive approach
// Time Complexity: O(n)
// Space Complexity: O(1), but if we consider recusrive stack than O(n)