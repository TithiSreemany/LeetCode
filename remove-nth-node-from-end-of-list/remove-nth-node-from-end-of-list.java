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

// Time Complexity : O(n)

class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode p = head;
        ListNode ptr = head;
        while (ptr.next!=null)
        {
            n=n-1;
            if (n==0)
                p=head;
            if (n<0)
                p=p.next;
            ptr=ptr.next;
        }
        if (n>0)
            return head.next;
        if (p.next!=null)
            p.next = p.next.next;
        return head;
    }
}